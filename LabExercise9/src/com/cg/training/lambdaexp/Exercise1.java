package com.cg.training.lambdaexp;

import java.util.Scanner;

interface Funct{
	double abstractfun(int x, int y);
}
public class Exercise1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values");
		int x=sc.nextInt();
		int y = sc.nextInt();
		Funct fobj =
				(a, b)->Math.pow(x, y);
				double a= fobj.abstractfun(x,y);
				System.out.println(a);

				;
	}
}
