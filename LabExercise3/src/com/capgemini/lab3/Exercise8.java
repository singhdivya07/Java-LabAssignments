package com.capgemini.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	public static boolean checkPositive(String str)
	{
		int len = str.length();
		char c[] = new char[len];
		for(int i =0 ; i<len;i++)
		{
			c[i]=str.charAt(i);
		}
		Arrays.sort(c);
		for(int i =0; i<len ;i++)
		{
			if(c[i]!=str.charAt(i))
				return false;
		}
		
		return true;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String :");
	String s = sc.nextLine();
	if(checkPositive(s))
		System.out.println("True");
	else
		System.out.println("False");
}
}
