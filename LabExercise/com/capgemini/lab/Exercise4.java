package com.capgemini.lab;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int n,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		for(int i =2; i<=n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}

}
