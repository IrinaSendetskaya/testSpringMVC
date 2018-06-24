package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> getUsers() {
		List<String> list = new ArrayList<>();
		list.add("One");
		return list;
	}

}
