package com.cg.eis.Demo;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee e1=new Employee();
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.getEmployeeDetails(e1);
		String insuranceScheme1=employeeService.getInsuranceScheme(e1);
		employeeService.showEmployeeDetails();
		System.out.println("Insurance Scheme: "+insuranceScheme1);
		
		
		
	}

}
