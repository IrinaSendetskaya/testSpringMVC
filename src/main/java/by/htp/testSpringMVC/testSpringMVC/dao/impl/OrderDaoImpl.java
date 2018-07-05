package by.htp.testSpringMVC.testSpringMVC.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.dao.OrderDao;
import by.htp.testSpringMVC.testSpringMVC.domain.Order;
import by.htp.testSpringMVC.testSpringMVC.repository.OrderRepository;
import by.htp.testSpringMVC.testSpringMVC.repository.SpringDataConfig;

@Component
public class OrderDaoImpl implements OrderDao {
	
	private static final Logger logger=LogManager.getLogger();
	
	@Autowired
	OrderRepository orderRepository;
	
	
	public OrderDaoImpl() {  //для спринга пустой конструктор
		super();
	}

	@Override
	public void create(Order entity) {

		orderRepository.save(entity);
	}

	@Override
	public Order read(int id) {

		return orderRepository.findById(id).get();
	}

	@Modifying
	@Override
	public void update(Order entity) {
		orderRepository.save(entity);
		//springDataConfig.entityManagerFactory().nativeEntityManagerFactory.createEntityManager().merge(entity);
	}

	@Override
	public void delete(Order entity) {
		orderRepository.delete(entity);
		
	}

	@Override
	public List<Order> readAll() {
		List <Order> listOrder=new ArrayList<Order>();
        Iterable<Order> iterator=orderRepository.findAll();
        for (Order order : iterator) {
			listOrder.add(order);
		}
        return listOrder;
	}


}
