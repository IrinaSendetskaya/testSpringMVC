package by.htp.testSpringMVC.testSpringMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import by.htp.testSpringMVC.testSpringMVC.dao.impl.CarDaoImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.Car;
import by.htp.testSpringMVC.testSpringMVC.service.CarService;



public class CarServiceImpl implements CarService {

	@Autowired
	private CarDaoImpl carDao;
	
	@Override
	public List<Car> getCars() {
		
		return carDao.readAll();
	}
	
	public int getCarCount() {
		//int count=(int)carRepository.count();
		int count=getCars().size();
		return count;
	}
	
//	@Override
//	public List<Car> findCarByNameAndDate(String name, String date) {
////	    return carRepository.findCarByNameAndDate(name, date);
//		return carRepository.;
//	}
//	
//	@Override
//	public List<Car> mostPopularCarInDates(String dateOne, String dateTwo){
//		return carRepository.mostPopularCarInDates(dateOne, dateTwo);
//	}

}
