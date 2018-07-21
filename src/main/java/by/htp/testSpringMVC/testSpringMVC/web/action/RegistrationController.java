package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.dao.impl.OrderDaoImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Controller  
public class RegistrationController {

	boolean flag=true;
	
     @Autowired
     //@Qualifier(value="daoImpl")
     private UserDaoHibernateImpl userDao;   //тут д/б/ ссылки на сервисы!!
//     @Autowired
//     private UserServiceImpl userService;
     @Autowired
 	OrderDaoImpl orderDaoImpl;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView newUser() {
		return new ModelAndView("registration", "userJSP", new User());
	}
	
	@RequestMapping(value = "/checkPass", method = RequestMethod.GET)
	public @ResponseBody
	String checkPass(@RequestParam String pass) {
		//включить проверку символов
		return "Good Password";
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
	public @ResponseBody
	String checkLogin (@ModelAttribute("userJSP") User user) {
		
		 List<User> listUsers= userDao.readAll();
		 
		 for (User userList : listUsers) {
			 if(userList.getName().equalsIgnoreCase(user.getName())) {
				flag=false;
				return "This login has been already existed!";	 			
			 }			 
		}
		 flag=true;
		 return "login created";
		
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public @ResponseBody
	String signup(@ModelAttribute("userJSP") User user, HttpSession session) {
		if(flag) {
		ModelAndView mav=new ModelAndView();
		
		userDao.create(user);
	
        session.setAttribute("user",user);
		
        //лучше переводить на логин
		mav.setViewName("redirect:/main");
		mav.addObject("userJSP", user);
		
		return "You are successfully registered";
		}
		return "You must change login or password!";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView enterToProgile(Principal principal, HttpSession session) {
		
        Object o = session.getAttribute("user");
        User currentUser;
        if (o!=null){
        	currentUser=(User) o;
        	return new ModelAndView("profile", "userJSP",currentUser);
        }
        else
            return new ModelAndView("login");
	}
}
