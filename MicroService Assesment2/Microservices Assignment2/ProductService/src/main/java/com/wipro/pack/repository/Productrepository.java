package com.wipro.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.pack.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product, Integer> {
	
	
	

}
