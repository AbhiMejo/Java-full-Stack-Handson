package com.registrationform.registrationform;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registration")
public class RegEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	
	public String surname;
	
	public String city;
	
	public String state;
	
	public Long phone;
	
	

	public RegEntity() {
		super();
	}

	@Override
	public String toString() {
		return "RegEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", city=" + city + ", state=" + state
				+ ", phone=" + phone + "]";
	}

	public RegEntity(Long id, String name, String surname, String city, String state, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.state = state;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

}
