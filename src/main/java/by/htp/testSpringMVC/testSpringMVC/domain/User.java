package by.htp.testSpringMVC.testSpringMVC.domain;

import java.io.Serializable;

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
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="id")  //необязательно, совп с им таблтцы
		int id;
	
	@Column(name="name")
		String name;
	@Column(name="pass")
		String pass;
		
		
		public User() {
		
		}		
		
		

		public User(String name, String pass) {
			super();
			this.name = name;
			this.pass = pass;
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
	
}
