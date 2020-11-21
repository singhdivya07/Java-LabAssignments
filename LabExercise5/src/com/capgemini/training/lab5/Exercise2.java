package com.capgemini.training.lab5;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String str)
	{
		System.out.println(str);
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname;
		String lname;
		try {
		System.out.println("Enter your full name: ");
		fname = sc.nextLine();
		lname = sc.nextLine();
		if(fname.isBlank()|| lname.isBlank())
		{
			throw new MyException("First or last name is blank ");
		}
		else
		{
			System.out.println(fname+" "+lname);
		}
		}
		catch(MyException a) {
			System.out.println(a);
		}
	}

}
