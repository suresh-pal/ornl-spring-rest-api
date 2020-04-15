package gov.ornl.rest.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_account")
public class User {


	@Id
	private String userid;
	
	private String firstname;
	
	private String lastname;
	
	public User(String userid, String firstname, String lastname, String email) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public User() {
	}
	private String email;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
