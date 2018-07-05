package by.htp.testSpringMVC.testSpringMVC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.User;

@Component
public interface UserRepository extends CrudRepository<User, Integer>{

}
