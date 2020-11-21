package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		Exercise3 obj = new Exercise3();
		System.out.print(str+" = ");
		System.out.println(obj.alterString(str));
	}
	public String alterString(String s) {
		char[] a= s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='a' && a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u')
			{
				a[i] =(char)(a[i]+1);
			}
		}
		s=String.valueOf(a);
		return s;
	}

}
