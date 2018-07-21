package by.htp.testSpringMVC.testSpringMVC;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.htp.testSpringMVC.testSpringMVC.dao.impl.CarDaoImpl;
import by.htp.testSpringMVC.testSpringMVC.domain.Car;
import by.htp.testSpringMVC.testSpringMVC.repository.SpringDataConfig;
import by.htp.testSpringMVC.testSpringMVC.service.impl.UserServiceImpl;


@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringDataConfig.class)
public class RepositoryTest  {
	
	@Autowired
	private CarDaoImpl carDaoImpl;
	
	 @Autowired
     //@Qualifier(value="service")
     private UserServiceImpl userService;   //тут д/б/ ссылки на сервисы!!
	

	public CarDaoImpl getCarDaoImpl() {
		return carDaoImpl;
	}



	public UserServiceImpl getUserService() {
		return userService;
	}



	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}



	public void setCarDaoImpl(CarDaoImpl carDaoImpl) {
		this.carDaoImpl = carDaoImpl;
	}


	public RepositoryTest() {
		
	}
	
	@Test
	public void findCarByID() {
		String carReposit=carDaoImpl.read(1).toString(); 
		String carExpected=new Car("xn", "jjhj",new BigDecimal(10), 1).toString();
		Assert.assertEquals(carReposit, carExpected);
	}
	@Test
	public void findByName() {
		String carReposit=userService.readUser("admin").getName();
		String carExpected="admin";
		Assert.assertEquals(carReposit, carExpected);
	}
	
//	@Test
//	public void createCar() {
//		int id=19;
//		Car car=new Car(id,"xn", "jjhj",new BigDecimal(10), 1);
//		carDaoImpl.create(car);
//		String carReposit=carDaoImpl.read(id).toString();
//		String carExpected=new Car(19,"xn", "jjhj",new BigDecimal(10), 1).toString();
//		Assert.assertEquals(carReposit, carExpected);
//	}
//	
	//@Test
	public void findListCar() {
		List <Car> carRepository=carDaoImpl.readAll(); 
		List <Car> carExpected=carDaoImpl.readAll();
		Assert.assertTrue(carRepository.containsAll(carExpected)); //isEqualCollection(carRepository, carExpected));
	}
	
//	//@Test
//	public void findCarByNameAndDate() {
//		List <Car> carRepository=carServiceImpl.findCarByNameAndDate("admin", "0000-00-00");
//		List <Car> carExpected=carServiceImpl.getCars();  //?????
//		Assert.assertTrue(carRepository.containsAll(carExpected));
//	}
//	//@Test
//	public void mostPopularCarInDates() {
//		List <Car> carRepository=carServiceImpl.mostPopularCarInDates("0000-00-00", "0000-00-00");
//		List <Car> carExpected=carServiceImpl.getCars();  ///????
//		Assert.assertTrue(carRepository.containsAll(carExpected));
//	}
	
//	@Test
//	public void simpleTest() {
//	  String text = UUID.randomUUID().toString();
//	  dataDao.save(new Data(text));
//	  Collection result = dataDao.find(text);
//	  Assert.assertEquals(1, result.size());
//	  Assert.assertEquals(text, result.iterator().next().getText());
//	}
//	
//	@Test
//	public void findCarByID2() {
//		carServiceImpl.getByName(""); 
//		
//	}

}
