package com.capgemini.lab;
import java.util.*;
public class Exercise8 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number to check ");
		int n = sc.nextInt();
		if( CheckNumber(n))
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
			
		
	}
	public static boolean CheckNumber(int n)
	{
		if(n==0)
			return false;
		while (n !=1 )
		{
			if(n % 2 != 0)
				return false;
			n = n/2;
		}
	return true;
	}

}
