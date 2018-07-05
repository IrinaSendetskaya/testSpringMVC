package by.htp.testSpringMVC.testSpringMVC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Order;

@Component
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
