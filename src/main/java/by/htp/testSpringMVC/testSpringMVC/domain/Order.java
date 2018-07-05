package by.htp.testSpringMVC.testSpringMVC.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import by.htp.testSpringMVC.testSpringMVC.dao.hbn.UserDaoHibernateImpl;
import by.htp.testSpringMVC.testSpringMVC.dao.impl.CarDaoImpl;

@Entity
@Table(name="Orders")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5731960048387459760L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="idUser")
	private int idUser;
	@Column(name="idCar")
	private int idCar;
	@Temporal(TemporalType.DATE)
	@Column(name="dateRent")
	private Date dateRent;
	@Temporal(TemporalType.DATE)
	@Column(name="dateReturn")
	private Date dateReturn;
	
	
	public Order() {
		super();
		
	}
	
	public Order(int id, int idUser, int idCar, Date dateRent, Date dateReturn) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idCar = idCar;
		this.dateRent = dateRent;
		this.dateReturn = dateReturn;
	}

//	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//	@JoinColumn(name = "idUser", nullable = false)
//	private User user;
//	
//	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//	@JoinColumn(name = "idCar", nullable = false)
//	private Car car;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateRent() {
		return dateRent;
	}

	public void setDateRent(Date dateRent) {
		this.dateRent = dateRent;
	}

	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}

	@Override
	public String toString() {
		return "Order [ id=" + id + " user_id=" + idUser+": "+new UserDaoHibernateImpl().read(idUser) + 
				", car_id=" + idCar + ": "+new CarDaoImpl().read(idCar)+", dateStart= "+dateRent+
				", dateEnd="+dateReturn+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCar;
		result = prime * result + idUser;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (idCar != other.idCar)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
	
	
	

}
