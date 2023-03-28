package com.project.Cargo.Courier.management.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.Cargo.Courier.management.system.entity.Product;
//Repository class
public interface ProductRepository extends JpaRepository<Product, Integer> {
	// custom Method
	List<Product> findBypshippingprice(Double pshippingprice);

	// Method using JPQL
		@Query("select s from Product s")
		List<Product> findAll();
	}
