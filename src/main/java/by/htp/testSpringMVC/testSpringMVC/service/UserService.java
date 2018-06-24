package by.htp.testSpringMVC.testSpringMVC.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
	
	List<String> getUsers();

}
