package by.htp.testSpringMVC.testSpringMVC.dao;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Order;
@Component
public interface OrderDao extends BaseDao<Order> {

	//void insertNewOrder(int userId, int carId);
}
