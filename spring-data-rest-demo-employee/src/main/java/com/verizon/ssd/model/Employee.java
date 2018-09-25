package com.verizon.ssd.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demo")
public class Employee {
	@Id
	private Long id;
	private String name;
	private Double basic;
	private Double hra;
	private String dept;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getHra() {
		return hra;
	}
	public void setHra(Double hra) {
		this.hra = hra;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	

}
