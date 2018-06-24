package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.domain.Car;
import by.htp.testSpringMVC.testSpringMVC.service.CarService;


@Component
public class CarServiceImpl implements CarService {

	@Override
	public List<Car> getCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW"));
		cars.add(new Car("VW"));
		cars.add(new Car("Audi"));
		
		return cars;
	}
	
	public int getCarCount() {
		int count=getCars().size();
		return count;
	}

}
