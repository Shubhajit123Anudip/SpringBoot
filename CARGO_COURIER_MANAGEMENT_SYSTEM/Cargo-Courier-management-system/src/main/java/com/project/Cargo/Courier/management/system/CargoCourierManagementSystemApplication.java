 package com.project.Cargo.Courier.management.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.Cargo.Courier.management.system.entity.Product;
import com.project.Cargo.Courier.management.system.repository.ProductRepository;

@SpringBootApplication
public class CargoCourierManagementSystemApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository pr;

	public static void main(String[] args) {
		SpringApplication.run(CargoCourierManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p1 = Product.builder().pname("Mobile").pweight("150 gm").pdescription("Sumsung")
				.pshippingprice(150.00).pquantity(25).build();
		Product p2 = Product.builder().pname("Mouse").pweight("50g").pdescription("Dell")
				.pshippingprice(1200.00).pquantity(5).build();
		Product p3 = Product.builder().pname("Shoes").pweight("600 gm").pdescription("Formal type")
				.pshippingprice(600.00).pquantity(3).build();

		pr.save(p1);
		pr.save(p2);
		pr.save(p3);
		

		System.out.println("---------------All saved-------------");

	}

}
