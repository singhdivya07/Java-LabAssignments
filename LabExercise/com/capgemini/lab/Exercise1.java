package com.capgemini.lab;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		sumOfCubes(number);
	}
	static int sumOfCubes(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit = n % 10;
			sum = sum +digit *digit*digit;
			n = n/10;
			
		}
		System.out.println("Sum of cubes of digits of given number is " +sum);
		return sum;
	}

}
