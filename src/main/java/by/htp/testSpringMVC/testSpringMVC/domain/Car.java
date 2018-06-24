package by.htp.testSpringMVC.testSpringMVC.domain;

public class Car {
	
	private String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public Car() {
	
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car brand: " + brand;
	}
}
