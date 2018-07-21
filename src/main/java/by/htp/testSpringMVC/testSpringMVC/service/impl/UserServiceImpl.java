package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.User;
import by.htp.testSpringMVC.testSpringMVC.repository.UserRepository;
import by.htp.testSpringMVC.testSpringMVC.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	public UserServiceImpl() {
	
	}

	@Override
	public List<String> getUsers() {
		List<String> list = new ArrayList<>();
		list.add("One");
		return list;
	}

	@Override
	public User readUser(String name) {
		userRepository.findByName(name);
		return null;
	}

}
