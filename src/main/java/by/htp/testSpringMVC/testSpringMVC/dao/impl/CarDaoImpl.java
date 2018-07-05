package by.htp.testSpringMVC.testSpringMVC.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.dao.CarDao;
import by.htp.testSpringMVC.testSpringMVC.domain.Car;
import by.htp.testSpringMVC.testSpringMVC.repository.CarRepository;

@Component
public class CarDaoImpl implements CarDao{
	
	@Autowired
	CarRepository carRepository;
	
	
	public CarDaoImpl() {

	}

	@Override
	public void create(Car entity) {
		carRepository.save(entity);
		
	}

	@Override
	public Car read(int id) {
	
		return carRepository.findById(id).get();
	}

	@Override
	public void update(Car entity) {
		//springDataConfig.entityManagerFactory().nativeEntityManagerFactory.createEntityManager().merge(entity);
		carRepository.save(entity);
		
	}

	@Override
	public void delete(Car entity) {
		carRepository.delete(entity);
		
	}

	@Override
	public List<Car> readAll() {
		List<Car> carList=new ArrayList<Car>();
		Iterable <Car> iterator=carRepository.findAll();
		
//		while(iterator.hasNext())
//			carList.add(iterator.next());
		for (Car car : iterator) {
			carList.add(car);
		}
		return carList;
	}

}
