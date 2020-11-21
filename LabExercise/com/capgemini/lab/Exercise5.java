package com.capgemini.lab;
import java.util.Scanner;
public class Exercise5 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		long sum = calculateSum(n);
		System.out.println("Sum ="+ sum);
	}
	
private static long calculateSum(int n)
{
	long sum=0;
	for(int i=1; i<n;i++)
	{
		if(i%3==0 || i%5==0)
		{
			sum+=i;
		}
	}
	return sum;
}

}
