package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	 Employee e=new Employee();

	@Override
	public void getEmployeeDetails(Employee employee) {
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id of employee:");
			int id=sc.nextInt();
			e.setId(id);
			sc.nextLine();
			System.out.println("Enter name of employee:");
			String name=sc.nextLine();
			e.setName(name);
			System.out.println("Enter salary: ");
			double salary=sc.nextDouble();
			e.setSalary(salary);
			sc.nextLine();
			System.out.println("Enter Designation:");
			String desig=sc.nextLine();
			e.setDesignation(desig);
			
	}

	@Override
	public String getInsuranceScheme(Employee employee) {
		String insurance;
		if(e.getSalary()<=10000 && e.getDesignation().equalsIgnoreCase("trainee"))
			
			insurance="1 year inssuarance";
		else if(e.getSalary()>10000 &&e.getSalary()<=40000 && e.getDesignation().equalsIgnoreCase("trainee"))
			insurance="3 years insurance";
		
		else
		insurance= "you are under life insurance plan.";
		
		return insurance;
	}

	@Override
	public void showEmployeeDetails() {
		
		System.out.println("Employee Details....");
		System.out.println("ID: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("salary: "+e.getSalary());
		System.out.println("Designation: "+e.getDesignation());
		
	}

	
}
