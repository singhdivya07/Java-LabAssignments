package com.capgemini.lab;
import java.util.*;
public class Exercise6 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		long sum = calculateDifference(n);
		System.out.println("Sum of difference ="+ sum);
		
	}
	private static long calculateDifference(int n)
	{
		int i,j,sum;
		i=(n*(n+1) *(2 * n + 1)) / 6;
		
		j = (n * (n + 1)) / 2;
		
		j= j*j;
		
		sum = Math.abs(i - j );
		return sum;
		
	}
}
