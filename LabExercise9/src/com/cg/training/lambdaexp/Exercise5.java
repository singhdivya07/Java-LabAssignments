package com.cg.training.lambdaexp;
import java.util.*;
import java.util.function.Function;
public class Exercise5 {
	
public static int factorial(int n)
{
	int fact =1;
	for(int i =2 ; i<= n; i++)
	{
		fact = fact *i;
	}
return fact;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int num = sc.nextInt();
	Function<Integer, Integer> f = Exercise5::factorial;
	int fact = f.apply(num);
	System.out.println("Factorial: "+fact);
}
}
