package by.htp.testSpringMVC.testSpringMVC.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.dao.OrderDao;
import by.htp.testSpringMVC.testSpringMVC.domain.Order;
import by.htp.testSpringMVC.testSpringMVC.repository.OrderRepository;

@Component
public class OrderDaoImpl implements OrderDao {
	
	//private static final Logger logger=LogManager.getLogger();
	
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
	
//	@Override
//	public void insertNewOrder(int userId, int carId) {
//
//		Connection conn=DBConnectionHelper.connect();
//	
//		try (PreparedStatement ps=conn.prepareStatement(
//				"INSERT INTO Orders (idUser,idCar) VALUES (?,?)" )) {
//			
//			ps.setInt(1, userId);
//			ps.setInt(2, carId);
//			
//			ps.executeUpdate();
//			logger.error("Error!");
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		} 

}
