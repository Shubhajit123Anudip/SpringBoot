package com.project.Cargo.Courier.management.system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.Cargo.Courier.management.system.dto.ProductDto;
import com.project.Cargo.Courier.management.system.entity.Product;


@Component
public interface ProductService {

	// 1 Adding product for courier
Product addProduct(ProductDto productdto);

// 2 getting all product list
List<Product> getAllProduct();

// 3 Update product detail
Product updateProduct(Product product, Integer pid);

// 4 Delete the Product
String removeProduct(Integer pid);

// 5 getting Single Product detail
Product getAProduct(Integer pid);

// Get All the Products With the same Price
List<Product> getProductByShippingPrice(Double pshippingprice);

// GettingAllProduct using JPQL
List<Product> getAllProduct_byJPQL();


}
