package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "employee_details")
//@Builder
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid", length = 10)
	private Integer id;
	@Column(name = "ename", length = 20)
	private String empname;
	@Column(name = "addr", length = 20)
	private String address;
	@Column(name = "empno", length = 11)
	private Long mobno;

	public Employee(Integer id, String empname, String address, Long mobno) {
		super();
		this.id = id;
		this.empname = empname;
		this.address = address;
		this.mobno = mobno;
	}

	public Employee(String empname, String address, Long mobno) {
		super();
		this.empname = empname;
		this.address = address;
		this.mobno = mobno;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobno() {
		return mobno;
	}

	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
}
