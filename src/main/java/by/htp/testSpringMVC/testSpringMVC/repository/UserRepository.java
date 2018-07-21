package by.htp.testSpringMVC.testSpringMVC.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import by.htp.testSpringMVC.testSpringMVC.domain.User;

//@Component
public interface UserRepository extends CrudRepository<User, Integer>{

//что-то не так
 @Query(value = "select u from User u where u.name=:name")
	User findByName(@Param("name") String name);
	
}
