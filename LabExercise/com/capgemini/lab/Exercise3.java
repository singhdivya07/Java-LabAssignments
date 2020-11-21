package com.capgemini.lab;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
int n,a=1,b=1,c=0;
Scanner sc  = new Scanner(System.in);
System.out.println("Enter value: ");
n = sc.nextInt();
f.fib(a,b,c,n);
f.recfib(a,b,c,n);
	}
}


class Fibonacci
{
	void fib(int a, int b, int c,int n)
	{
		for(int i=1; i<=n-2;i++)
		{
			c= a+b;
			a=b;
			b=c;
		}
		a=b=1;
		System.out.println("nth value in the series using non recursive function is : "+c);
		
	}
	void recfib(int a, int b , int c, int n)
	{
		if(n-2>0)
		{
			c=a+b;
			a=b;
			b=c;
			recfib(a,b,c,n-1);
			return;
		}
		System.out.println("\nnth value in the series using recursive function is : "+c);
	}

}
