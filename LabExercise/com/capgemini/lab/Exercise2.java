package com.capgemini.lab;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		switch(choice)
		{
			case "red": 
				System.out.println("stop");
				break;
			case "yellow" :
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
			default:
				System.out.println("Please select correct option");
		}

	}

}
