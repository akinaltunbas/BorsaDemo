package domain;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;

@Entity
public class Kullanici {
	
	@Id
	@TableGenerator(name="KUL_GEN")
	@GeneratedValue(generator="KUL_GEN")
	private int id;
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	
	private UserType userType;
	
	@ManyToMany
	private List<Hisse> hisses;
	
	
	public Kullanici() {
		super();
	}

	

	public Kullanici(String name, String surname, String email, String username, String password, UserType userType) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userType = userType;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}



	public List<Hisse> getHisses() {
		return hisses;
	}



	public void setHisses(List<Hisse> hisses) {
		this.hisses = hisses;
	}



	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", userType=" + userType + "]";
	}

	


	

	
	
	
	
}
