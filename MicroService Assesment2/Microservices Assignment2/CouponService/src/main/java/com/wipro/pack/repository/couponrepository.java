package com.wipro.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.pack.model.Coupon;
@Repository
public interface couponrepository extends JpaRepository<Coupon, String> {

}
