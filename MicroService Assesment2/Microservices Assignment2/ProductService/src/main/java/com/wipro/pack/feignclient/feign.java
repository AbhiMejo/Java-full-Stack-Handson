package com.wipro.pack.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="CouponService")
public interface feign  {

	@RequestMapping("/get/{ccode}")
	public double getDiscount(@PathVariable String ccode);
		
	
}
