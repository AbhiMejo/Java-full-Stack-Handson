package com.wipro.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.pack.model.Product;
import com.wipro.pack.repository.Productrepository;
@Service
public class productservice {
	@Autowired
	private Productrepository prepo;
	public Product findByproductId(Integer id){
	return prepo.findById(id).orElse(null);
	}

	public Double calculateDiscount(Product product,Double percentage) {
	double oldprice = product.getPprice();
	if(percentage != null)
	{
	Double newprice = oldprice - (oldprice*(percentage/100));
	return newprice;
	}
	return null;
	}

}
