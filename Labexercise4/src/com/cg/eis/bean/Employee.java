package com.cg.eis.bean;

public class Employee {
  private Integer id;
  private String name;
  private Double salary;
  private String designation;
  private String insuranceScheme;

  
  
  public Employee() {
	super();
}



public Employee(Integer id, String name, Double salary, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
	//this.insuranceScheme = insuranceScheme;
}



public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public Double getSalary() {
	return salary;
}



public void setSalary(Double salary) {
	this.salary = salary;
}



public String getDesignation() {
	return designation;
}



public void setDesignation(String designation) {
	this.designation = designation;
}



public String getInsuranceScheme() {
	return insuranceScheme;
}



public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme = insuranceScheme;
}





	
}

