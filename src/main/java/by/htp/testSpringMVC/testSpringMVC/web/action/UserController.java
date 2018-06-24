package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.UserDao;
import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.User;
import by.htp.testSpringMVC.testSpringMVC.service.UserService;
import by.htp.testSpringMVC.testSpringMVC.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	//@Qualifier(value="daoImpl")
	//private UserDao userDaoImpl; 
	
	
	
/*	public UserController(UserDaoHibernateImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public UserDaoHibernateImpl getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDaoHibernateImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
*/


	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	

	private static final Logger log= LogManager.getLogger(UserController.class);

	//@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	   public ModelAndView login(@RequestParam(value="error", required=false) String error){
		
		ModelAndView model=new ModelAndView();
		if(error!=null) {
			model.addObject("error", "Неправильные имя или пароль!");
			log.debug(
		              "Неправильные имя или пароль! "
		             +model.getViewName());
			
		}
		
		model.setViewName("login");
		
	      return model;
	   }
	
	//@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin (ModelMap mav) {
		//mav.addAttribute(attributeName, attributeValue)
	      return "admin";
	   }
	
	//@RequestMapping(value = "/user", method = RequestMethod.GET)
	 public String user (ModelMap mav) {
	      return "user";
	   }
	
	//@RequestMapping(value = "/error", method = RequestMethod.GET)
	 public String error (ModelMap mav) {
		mav.addAttribute("message", "Неправильный логин или пароль!!");
	      return "error";
	   }
	
	//@RequestMapping(value = "logout", method = RequestMethod.GET)
	 public String logout (HttpServletRequest req, HttpServletResponse resp) {
		
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		if(auth!=null) {
			new SecurityContextLogoutHandler().logout(req, resp, auth);
		}
	      return "login";
	   }
	
	@RequestMapping(method = RequestMethod.GET)
	public List<String> listUser() {
		//UserDao userDao
		List<String> users= userService.getUsers();
		return users;
	}
	
	@RequestMapping(value = "/exeption",method = RequestMethod.GET)
	public void getException() {
		
		
		throw new RuntimeException();
	}
}
