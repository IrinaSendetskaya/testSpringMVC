package by.htp.testSpringMVC.testSpringMVC.web.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Controller
//@RequestMapping("/")
public class RestController {

	public RestController() {

	}
	
//	@RequestMapping (value = "/userslist", method=RequestMethod.GET)
	public List <User> users(){
		List <User> users=new ArrayList<>();
		users.add(new User("userRest","rest",new BigDecimal(10.5)));
		users.add(new User("userRest2","rest2",new BigDecimal(21)));
		
		return users;
	}
	
	//@RequestMapping (value = "/weather", method=RequestMethod.GET)
	public void getWeather(){
		
	}

}
