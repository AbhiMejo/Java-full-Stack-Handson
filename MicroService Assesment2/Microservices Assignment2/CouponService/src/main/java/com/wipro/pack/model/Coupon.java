package com.wipro.pack.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Coupon {
	@Id
	private String ccode;
	private double discount;
	private Date exdate;
	
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Date getExdate() {
		return exdate;
	}
	public void setExdate(Date edate) {
		this.exdate = edate;
	}
	@Override
	public String toString() {
		return "Coupon [ccode=" + ccode + ", discount=" + discount + ", edate=" + exdate + "]";
	}
	
	

}
