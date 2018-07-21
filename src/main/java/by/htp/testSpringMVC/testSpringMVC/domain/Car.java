package by.htp.testSpringMVC.testSpringMVC.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Car")
public class Car implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7502522041292343644L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="id")  //необязательно, совп с им таблтцы
		int id;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;

	@Column(name="price")
	private BigDecimal price;

	@Column(name="status")
	private int status;
	
	@Fetch(FetchMode.JOIN)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "car")
	private Set<Order> orders;
		
	
	public Car() {
	
	}
	
	public Car(int id, String brand, String model, BigDecimal price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public Car(String brand, String model, BigDecimal price, int status) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
	}

	public Car(String brand, String model, BigDecimal price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public Car(int id, String brand, String model, BigDecimal price, int status, Set<Order> orders) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Car id: "+id+", brand: " + brand+", model: "+model+", price: "+price+", status: "+status;
	}
}
