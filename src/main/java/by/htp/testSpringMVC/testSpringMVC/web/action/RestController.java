package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.testSpringMVC.testSpringMVC.dao.UserDao;
import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Controller
//@RequestMapping("/")
public class RestController {
	
//	@Autowired
//	private UserDao userDao;

	public RestController() {

	}
	
//	@RequestMapping (value = "/userslist", method=RequestMethod.GET)
	public List <User> users(){
		List <User> users=new ArrayList<>();
		users.add(new User("userRest","rest"));
		users.add(new User("userRest2","rest2"));
		
		return users;
	}
	
	//@RequestMapping (value = "/weather", method=RequestMethod.GET)
	public void getWeather(){
		
		
	}

}
