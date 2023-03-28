package com.project.Cargo.Courier.management.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "ProductId")
	private Integer pid;

	@Column(name = "ProductName")
	private String pname;

	@Column(name = "ProductWeight")
	private String pweight;

	@Column(name = "ProductQuantity")
	private int pquantity;

	@Column(name = "ProductDescription")
	private String pdescription;

	@Column(name = "ProductShippingPrice")
	private Double pshippingprice;

}
