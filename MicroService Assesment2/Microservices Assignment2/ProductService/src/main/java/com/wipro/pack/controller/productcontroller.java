package com.wipro.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.pack.feignclient.feign;
import com.wipro.pack.model.Product;
import com.wipro.pack.service.productservice;
@Controller
public class productcontroller {
	@Autowired
	feign f;
	@Autowired
	productservice Pservice;
	@ResponseBody
	@RequestMapping("/get/{pid}/{ccode}")
	public String couponCalculation(@PathVariable Integer pid ,@PathVariable String ccode) {
	double percentage = f.getDiscount(ccode);
	Product product= Pservice.findByproductId(pid);
	
	if(percentage != 0) {
	double newprice = Pservice.calculateDiscount(product, percentage);
	return product.toString()+" New Price : "+newprice;

	}
	return product.toString();

	}
	@RequestMapping("/{pid}")
	@ResponseBody
	public String getById(@PathVariable Integer pid)
	{
	Product p =  Pservice.findByproductId(pid);
	return p.toString();
	}
}
