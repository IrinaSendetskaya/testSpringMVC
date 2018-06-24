package by.htp.testSpringMVC.testSpringMVC.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
//@RequestMapping(value="/main")
public class SecondController {

	//@RequestMapping(value = "/", method = RequestMethod.GET)
	   public void common () {
	      System.out.println("common");
	   }
	
	//@RequestMapping(value = "/admin", method = RequestMethod.GET)
	 public void admin () {
	      System.out.println("admin");
	   }
	
	//@RequestMapping(value = "/user", method = RequestMethod.GET)
	 public void user () {
	      System.out.println("user");
	   }
}
