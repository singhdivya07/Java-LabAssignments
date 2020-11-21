package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Exercise2 e= new Exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println(e.getImage(str));
		
	}
	public String getImage(String a)
	{
		StringBuffer sbr = new StringBuffer(a);
		sbr.append("|");
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		sbr.append(sb);
		
		return sbr.toString();
		
	}

}
