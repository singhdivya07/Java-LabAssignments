package com.capgemini.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integers with one space gap :");
		String s= sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		
		int n;
		int sum=0;
		System.out.println("Each entered Integer: ");
		while(st.hasMoreTokens())
		{
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum+n;
			
		}
		System.out.println("Sum of all Integers: "+sum);
		sc.close();
		
	}

}
