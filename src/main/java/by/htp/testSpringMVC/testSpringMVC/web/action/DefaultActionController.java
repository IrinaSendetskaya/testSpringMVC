package by.htp.testSpringMVC.testSpringMVC.web.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.impl.CarDaoImpl;
import by.htp.testSpringMVC.testSpringMVC.dao.impl.OrderDaoImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.Car;
import by.htp.testSpringMVC.testSpringMVC.domain.Order;
import by.htp.testSpringMVC.testSpringMVC.domain.User;


@Controller
public class DefaultActionController {
	
	@Autowired
	CarDaoImpl carDaoImpl;
	@Autowired
	OrderDaoImpl orderDaoImpl;
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("main");
	}

	@RequestMapping(value = {"/","/main"}, method = RequestMethod.GET)
	public ModelAndView listCar(HttpServletRequest req, @ModelAttribute Car car, HttpSession session) {

        Object o = session.getAttribute("user");
        User currentUser;
        if (o==null){
        	return new ModelAndView("login","userJSP", new User());
        }
        else
        	currentUser=(User) o;
			
        ModelAndView mav=new ModelAndView();
		mav.setViewName("main"); 
		List<Car> cars= carDaoImpl.readAll();
		if(cars.isEmpty()) {
			mav.addObject("message", "В БД нет ниодной машины!");
		}
		mav.addObject("cars", cars);
		
		Order order;
		
		if(req.getParameter("Update")!= null)
		{
			car=carDaoImpl.read(Integer.parseInt(req.getParameter("ID")));
			order=new Order(currentUser, car);
			orderDaoImpl.create(order);		
		}		
		return mav;
	}
	  
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search (HttpServletRequest req) {
		return new ModelAndView("login", "userJSP", new User());
	}
		
	@RequestMapping(value = "/basket", method = RequestMethod.GET)
	public ModelAndView order(HttpSession session) {  	//@PathVariable
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("createbasket");   
		
		Object o = session.getAttribute("user");
        User currentUser;
        if (o==null){
        	return new ModelAndView("login","userJSP", new User());
        }
        else
        	currentUser=(User) o;
        
		List<Order> orderList=new ArrayList<>();
		for (Order order : orderDaoImpl.readAll()) {
			if(currentUser.getId()==order.getUser().getId()) {
				orderList.add(order);
			} 
			else
			{
				mav.addObject("message", "В корзину не добавлена машина!");
			}
		}		
		mav.addObject("orders", orderList);
		
		return mav;
	}
		
}
