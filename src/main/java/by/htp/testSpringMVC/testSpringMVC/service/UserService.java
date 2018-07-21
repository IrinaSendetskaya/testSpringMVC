package by.htp.testSpringMVC.testSpringMVC.service;

import java.util.List;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Component
public interface UserService {
	
	List<String> getUsers();
	
	User readUser(String name);

}
