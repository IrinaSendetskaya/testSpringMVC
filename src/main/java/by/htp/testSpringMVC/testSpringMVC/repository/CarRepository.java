package by.htp.testSpringMVC.testSpringMVC.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Car;

@Component
public interface CarRepository extends CrudRepository<Car, Integer>{

//	@Query("select c.id,c.brand,c.model from Car c join fetch Orders o join fetch User u where u.name = :name AND o.dateRent= :dateRent") 
//   List<Car> findCarByNameAndDate(@Param("name") String name, @Param("dateRent") String dateRent);
//	
//	@Query("select new list(c.id,c.brand,c.model) from MAX (select COUNT(*) from Car c join fetch Orders o where (o.dateRent between :dateOne AND :dateTwo))") 
 //   List<Car> mostPopularCarInDates(@Param("dateOne") String dateOne, @Param("dateTwo") String dateTwo);
}
