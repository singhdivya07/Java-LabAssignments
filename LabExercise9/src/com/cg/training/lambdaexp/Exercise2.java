package com.cg.training.lambdaexp;
import java.util.Scanner;

interface MyInterface{
	String formatString(String str1);
}


public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		MyInterface obj =
				(str1) -> str.replaceAll("", " ");
				String str1= obj.formatString(str);
				System.out.println(str1);

			
	};
	}
