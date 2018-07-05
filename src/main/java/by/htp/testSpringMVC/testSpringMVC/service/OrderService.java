package by.htp.testSpringMVC.testSpringMVC.service;

import java.util.List;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Order;

@Component
public interface OrderService {
	List<Order> getOrders();
	//void orderCar (int userId, int carId);
	
}
