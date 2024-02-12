package com.wipro.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.pack.model.Coupon;
import com.wipro.pack.service.Couponservice;
//import com.wipro.pack.service.couponservice;

@Controller
public class Couponcontroller {
	
	@Autowired
	Couponservice cservice;
	@ResponseBody
	@RequestMapping("/{ccode}")
	public Coupon getCoupon(@PathVariable String ccode) {
		return cservice.findBycouponId(ccode);
	}
	
	@ResponseBody
	@RequestMapping("/get/{ccode}")
	public double get(@PathVariable String ccode) {
	return cservice.getDiscount(ccode);
	}

}
