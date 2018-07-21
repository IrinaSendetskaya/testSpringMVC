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
@Table(name="User")
public class User implements Serializable{	
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = -6160127993200280264L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="id")  //необязательно, совп с им таблтцы
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="pass")
	private String pass;
		
	@Column(name="balance")
	private BigDecimal balance;
	
	@Fetch(FetchMode.JOIN)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Order> orders;
		
		public User() {
		
		}		
		

		public User(int id, String name, String pass, BigDecimal balance) {
			super();
			this.id = id;
			this.name = name;
			this.pass = pass;
			this.balance = balance;
		}



		public User(String name, String pass) {
			super();
			this.name = name;
			this.pass = pass;
		}

		public User(String name, String pass, BigDecimal balance) {
			super();
			this.name = name;
			this.pass = pass;
			this.balance = balance;
		}

		

		public User(int id, String name, String pass, BigDecimal balance, Set<Order> orders) {
			super();
			this.id = id;
			this.name = name;
			this.pass = pass;
			this.balance = balance;
			this.orders = orders;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}


		public BigDecimal getBalance() {
			return balance;
		}


		public void setBalance(BigDecimal balance) {
			this.balance = balance;
		}
		
		public Set<Order> getOrders() {
			return orders;
		}


		public void setOrders(Set<Order> orders) {
			this.orders = orders;
		}


		@Override
		public String toString() {
			return "User id: "+id+", name: " + name+", pass: "+pass+", balance: "+balance;
		}
	
}
