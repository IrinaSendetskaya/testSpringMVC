package by.htp.testSpringMVC.testSpringMVC.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Controller
// @RequestMapping(value="/")
public class UserController {

//	@Autowired
//	private UserServiceImpl userService;
	@Autowired
	private UserDaoHibernateImpl userDao;

	private static final Logger log = LogManager.getLogger(UserController.class);

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login","userJSP", new User());
	}

	//проверяем логин и пароль
	@RequestMapping(value = { "/checkUser" }, method = RequestMethod.POST)
	public ModelAndView checkUser(@ModelAttribute("userJSP") User userJSP, HttpSession session) {
		// User user=userService.readUser(userJSP.getName());
		User user = userDao.read(userJSP.getName(), userJSP.getPass());

		ModelAndView model = new ModelAndView();
		if (user == null) {
			model.addObject("error");
			model.addObject("message", "Неправильные имя или пароль!");
			log.debug("Неправильные имя или пароль! " + model.getViewName());
		} else
			session.setAttribute("user", user);

		model.setViewName("redirect:/main");
		return model;
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap mav) {
		mav.addAttribute("message", "Неправильный логин или пароль!!");
		return "error";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		session.invalidate();

		if (auth != null) {
			new SecurityContextLogoutHandler().logout(req, resp, auth);
		}
		return "login";
	}

	@RequestMapping(value = "/exeption", method = RequestMethod.GET)
	public void getException() {

		throw new RuntimeException();
	}

}
