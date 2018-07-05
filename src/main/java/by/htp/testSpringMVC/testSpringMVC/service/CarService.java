package by.htp.testSpringMVC.testSpringMVC.service;

import java.util.List;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Car;

@Component
public interface CarService {
	
	List<Car> getCars();
	
//	public List<Car> findCarByNameAndDate(String name, String date);
//	List<Car> mostPopularCarInDates(String dateOne, String dateTwo);

}
