package com.capgemini.lab3;

import java.util.*;

public class Exercise5 {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the text : ");
		String str = sc.nextLine();
		System.out.println("Entered String is : "+str);
		int count = str.replace(" ","").length();
		String[] word = str.split(" ");
		Arrays.toString(word);
		int wordcount =word.length;
		String[] line = str.split("[!?.:]+");
		Arrays.toString(line);
		int linecount = line.length;
		System.out.println("Number of words : "+wordcount);
		System.out.println("Number of chars : "+count);
		System.out.println("Number of lines : "+linecount);
sc.close();
	}

}
