package com.capgemini.lab;
import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		int n;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		n = sc.nextInt();
		if(CheckNumber(n))
			System.out.println("Digits are not in increaing order.");
		else
			System.out.println("Digits are in increasing order.");

			
	}
	public static boolean CheckNumber(int num)
	{
		boolean f = false;
		int cur = num%10;
		num= num/10;
		
		while(num>0)
		{
			if(cur <= num % 10)
			{
				f = true;
				break;
			}
			cur = num % 10;
			num =  num/10;
		}
		if(!f) 
		return false;
			//System.out.println("Digits are not in increaing order.");
		
		
	return true;
			//System.out.println("Digits are in increasing order.");
		

	}

}
