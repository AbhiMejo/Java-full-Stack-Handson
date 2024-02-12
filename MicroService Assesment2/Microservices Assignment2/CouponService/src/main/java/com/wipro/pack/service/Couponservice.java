package com.wipro.pack.service;

import java.sql.Date;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.pack.model.Coupon;
import com.wipro.pack.repository.couponrepository;

@Service
public class Couponservice {
	@Autowired
	couponrepository crepo;
	public Coupon findBycouponId(String id) {

		Coupon c = crepo.findById(id).orElse(null); 
		if(c!=null) {
		LocalDate localdate = LocalDate.now();
		Date ld = java.sql.Date.valueOf(localdate);
		Date d = c.getExdate();
		if(d.after(ld) || d.equals(ld)) {
		return c;
		}
		}
		return  null;
		}
		public double getDiscount(String couponId) {
			Coupon c = findBycouponId(couponId);
		if(c!=null) {
		return c.getDiscount();
		}
		return 0.0;

		}
}
