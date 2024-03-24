package com.example.emailverification;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private long userid;
    
    private String name;
    private String gender;
    private String mobile;
    private String email;
    private String password;
    
  private boolean isEnabled;

public UserEntity(long userid, String name, String gender, String mobile, String email, String password,
		boolean isEnabled) {
	super();
	this.userid = userid;
	this.name = name;
	this.gender = gender;
	this.mobile = mobile;
	this.email = email;
	this.password = password;
	this.isEnabled = isEnabled;
}

public long getUserid() {
	return userid;
}

public void setUserid(long userid) {
	this.userid = userid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isEnabled() {
	return isEnabled;
}

public void setEnabled(boolean isEnabled) {
	this.isEnabled = isEnabled;
}
}
    
    
    
    
    
    
    
    

//    private String emailId;
//
//    private String password;
//
//    @Column(name="first_name")
//    private String firstName;
//
//    @Column(name="last_name")
//    private String lastName;
//
//    private boolean isEnabled;
//
//	public long getUserid() {
//		return userid;
//	}
//
//	public void setUserid(long userid) {
//		this.userid = userid;
//	}
//
//	public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public boolean isEnabled() {
//		return isEnabled;
//	}
//
//	public void setEnabled(boolean isEnabled) {
//		this.isEnabled = isEnabled;
//	}
//}