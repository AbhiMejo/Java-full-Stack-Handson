package com.example.couponservice.CouponService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
	public String lol() {
		return"This is coupon Page";
	}
	
}
