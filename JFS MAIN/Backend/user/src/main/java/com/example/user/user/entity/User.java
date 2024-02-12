package com.example.user.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login_Credentials")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long userid;
	
	public String firstname;
	
	public String lastname;
	
	public String password;
	
	public int age;
	
	public String gender;
	
	public String adress;
	
	public Long phoneNumber;
	
	public boolean loginstatus;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(boolean loginstatus) {
		this.loginstatus = loginstatus;
	}

	public User(Long userid, String firstname, String lastname, String password, int age, String gender, String adress,
			Long phoneNumber, boolean loginstatus) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.loginstatus = loginstatus;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", age=" + age + ", gender=" + gender + ", adress=" + adress + ", phoneNumber="
				+ phoneNumber + ", loginstatus=" + loginstatus + "]";
	}

	public User() {
		super();
	}

	
	
	
}
