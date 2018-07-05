package by.htp.testSpringMVC.testSpringMVC.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
		
		public User() {
		
		}		
		

		public User(int id, String name, String pass, BigDecimal balance) {
			super();
			this.id = id;
			this.name = name;
			this.pass = pass;
			this.balance = balance;
		}





		public User(String name, String pass, BigDecimal balance) {
			super();
			this.name = name;
			this.pass = pass;
			this.balance = balance;
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
		
		@Override
		public String toString() {
			return "User id: "+id+", name: " + name+", pass: "+pass+", balance: "+balance;
		}
	
}
