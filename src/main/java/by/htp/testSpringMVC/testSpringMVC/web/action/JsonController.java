package by.htp.testSpringMVC.testSpringMVC.web.action;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;

@Controller
@RequestMapping(value = "/admin")
public class JsonController {
	
	@RequestMapping(value="/")
	public String mainPage() {
		
		return "admin_page";
	}
	
	@RequestMapping(value="/json")
	public @ResponseBody String mainPageJSON() {
		//return "{\"name\":\"John\"}";
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "John");
		return jsonObject.toJSONString();
	}
	
	@RequestMapping(value="/json2")
	public @ResponseBody String mainPageJSONtoServer(@RequestParam String login) throws ParseException {
		
		
		JSONParser jsonParser=new JSONParser();
		JSONObject jsonObject=(JSONObject) jsonParser.parse(login);
		String log=(String) jsonObject.get("login");
		
		//if(new UserDaoHibernateImpl().read(id))
		return "{\"key\":\"good login\"}";
	}

}
