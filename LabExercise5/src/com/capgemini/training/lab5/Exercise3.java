package com.capgemini.training.lab5;

import java.util.Scanner;
class EmployeeException extends Exception{

	public EmployeeException(String string) {
		System.out.println(string);
	}
	
}
public class Exercise3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary amount: ");
		int sal;
		try {
			sal = sc.nextInt();
			if(sal < 3000)
			{
				throw new EmployeeException("Salary is less than 3000");
			}
			System.out.println("Salary is "+sal);
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}

}
