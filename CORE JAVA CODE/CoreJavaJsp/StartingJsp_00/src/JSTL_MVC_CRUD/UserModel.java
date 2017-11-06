package JSTL_MVC_CRUD;

import java.util.Date;

public class UserModel {
	
	String UserName, password, email,id;
	Date registrdtionDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegistrdtionDate() {
		return registrdtionDate;
	}
	public void setRegistrdtionDate(Date registrdtionDate) {
		this.registrdtionDate = registrdtionDate;
	}
	
	
	
	

}
