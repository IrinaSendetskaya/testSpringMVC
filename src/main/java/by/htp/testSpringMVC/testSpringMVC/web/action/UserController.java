package by.htp.testSpringMVC.testSpringMVC.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/second")
public class UserController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public void common () {
	      System.out.println("commonSecond");
	   }
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	 public void admin () {
	      System.out.println("adminSecond");
	   }
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	 public void user () {
	      System.out.println("userSecond");
	   }
}
