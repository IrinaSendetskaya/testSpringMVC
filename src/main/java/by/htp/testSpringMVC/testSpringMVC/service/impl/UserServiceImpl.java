package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;


import by.htp.testSpringMVC.testSpringMVC.service.UserService;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
	
	}

	@Override
	public List<String> getUsers() {
		List<String> list = new ArrayList<>();
		list.add("One");
		return list;
	}

}
