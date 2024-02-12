package com.reactfull.fullcriteria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registration")
public class RSEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public String uname;
	
	public String password;
	
	public String confpass;
	
	public Long phone;
	
	public String about;
	
	
	

	public RSEntity() {
		super();
	}

	@Override
	public String toString() {
		return "RSEntity [id=" + id + ", uname=" + uname + ", password=" + password + ", confpass=" + confpass
				+ ", phone=" + phone + ", about=" + about + "]";
	}

	public RSEntity(Long id, String uname, String password, String confpass, Long phone, String about) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
		this.confpass = confpass;
		this.phone = phone;
		this.about = about;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfpass() {
		return confpass;
	}

	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
}
