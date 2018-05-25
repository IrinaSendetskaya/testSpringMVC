package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Controller
@RequestMapping(value = "/")
public class RegistrationController {
	
	boolean flag=true;
	
	@Autowired
	@Qualifier(value="daoImpl")
	private UserDaoHibernateImpl userDaoImpl;   //тут д/б/ ссылки на сервисы!!

	@RequestMapping(value = "newUser", method = RequestMethod.GET)
	public ModelAndView newUser() {
		return new ModelAndView("registrationJSP", "userJSP", new User());
	}
	
	@RequestMapping(value = "checkPass", method = RequestMethod.GET)
	public @ResponseBody
	String checkPass(@RequestParam String pass) {
		return "Good Password";
	}
	
	@RequestMapping(value = "checkLogin", method = RequestMethod.GET)
	public @ResponseBody
	String checkLogin (@ModelAttribute("userJSP") User user) {
		
		 List<User> listUsers= new UserDaoHibernateImpl().readAll();
		 
		 for (User userList : listUsers) {
			 if(userList.getName().equalsIgnoreCase(user.getName())) {
				flag=false;
				return "This login has been already existed!";	 			
			 }			 
		}
		 flag=true;
		 return "login created";
		
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public @ResponseBody
	String signup(@ModelAttribute("userJSP") User user) {
		if(flag) {
		new UserDaoHibernateImpl().create(user);
		return "You are successfully registered";
		}
		return "You must change login or password!";
	}
}
