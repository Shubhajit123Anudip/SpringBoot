package com.project.Cargo.Courier.management.system.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Cargo.Courier.management.system.dto.ProductDto;
import com.project.Cargo.Courier.management.system.entity.Product;
import com.project.Cargo.Courier.management.system.repository.ProductRepository;
import com.project.Cargo.Courier.management.system.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(ProductDto productdto) {
		Product product = Product.builder().pname(productdto.getPname()).pdescription(productdto.getPdescription())
				.pshippingprice(productdto.getPshippingprice()).pweight(productdto.getPweight())
				.pquantity(productdto.getPquantity()).build();
		return productRepository.saveAndFlush(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product, Integer pid) {
		Product _product = productRepository.findById(pid).get();
		_product.setPname(product.getPname());
		_product.setPdescription(product.getPdescription());
		_product.setPshippingprice(product.getPshippingprice());
		_product.setPweight(product.getPweight());
		return productRepository.save(_product);
	}

	@Override
	public String removeProduct(Integer pid) {
		productRepository.deleteById(pid);
		;
		return "Product with the id " + pid + " has been deleted";
	}

	@Override
	public Product getAProduct(Integer pid) {
		return productRepository.findById(pid).get();
	}

	@Override
	public List<Product> getProductByShippingPrice(Double pshippingprice) {
		return ((ProductRepository) productRepository).findBypshippingprice(pshippingprice);
	}

	@Override
	public List<Product> getAllProduct_byJPQL() {
		return productRepository.findAll();
	}
}
