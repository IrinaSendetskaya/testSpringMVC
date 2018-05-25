package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.User;


@Controller
@RequestMapping(value = "/")
public class DefaultActionController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView common() {
		return new ModelAndView("loginJSP", "userJSP", new User());
	}
	  
	@RequestMapping(value = "check-user", method = RequestMethod.POST)
	public ModelAndView checkUser (@ModelAttribute("userJSP") User user) {
		ModelAndView mav=new ModelAndView();
		
		if(user.getName().equalsIgnoreCase("admin")&&user.getPass().equalsIgnoreCase("admin")) {
			mav.setViewName("admin");
		    mav.addObject("userJSP", user);
		   
			mav.addObject("message_admin", "Hello Admin!");
			
			 List<User> listUsers= new UserDaoHibernateImpl().readAll();
			 mav.addObject("users", listUsers);
			
	}
		else {
			mav.setViewName("user");
			
	        mav.addObject("userJSP", user);
			mav.addObject("message_user", "Hello User!");
		}
		return mav;
		
	}
	
//	@RequestMapping(value = "admin", method = RequestMethod.POST)
//	public ModelAndView listUser() {
//		//UserDao userDao
//		List<User> users= new UserDaoHibernateImpl().readAll();   
//		return new ModelAndView("admin", "userJSP", users);
//	}
}
