package com.cg.training.lambdaexp;

import java.util.Scanner;
import java.util.function.Predicate;

interface Validity{
	boolean Authentication(String user, String pass);
}

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		String uname ="Divya ";
		//		String passwrd ="root";
		System.out.println("Enter username");
		String s= sc.next();
		System.out.println("Enter password");
		String s1= sc.next();
		Validity obj = 
				(a,b)->
		a.equals("Divya") && b.equals("root");
		System.out.println("Result :" +obj.Authentication(s,s1));


	}
}
