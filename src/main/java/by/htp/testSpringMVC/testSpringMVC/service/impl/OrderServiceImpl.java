package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import by.htp.testSpringMVC.testSpringMVC.dao.OrderDao;
import by.htp.testSpringMVC.testSpringMVC.domain.Order;
import by.htp.testSpringMVC.testSpringMVC.service.OrderService;


public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;
	
	
	public OrderServiceImpl() {
		super();
	}



	public OrderDao getOrderDao() {
		return orderDao;
	}



	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}



//	@Override
//	public void orderCar (int userId, int carId) {
//		
//		orderDao.insertNewOrder(userId, carId);
//		
//		
//	}



	@Override
	public List<Order> getOrders() {
		return orderDao.readAll();
	}

}
