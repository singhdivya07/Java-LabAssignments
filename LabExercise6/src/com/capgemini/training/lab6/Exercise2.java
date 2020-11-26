package com.capgemini.training.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	static Map<Character, Integer> countChars(char[] arr)
	{
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(char c : arr)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
				count.put(c, 1);
		}
		return count; 
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String to count characters: ");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		Map<Character, Integer> countchar =countChars(arr);
		for (Map.Entry entry : countchar.entrySet()) { 
          System.out.println(entry.getKey() + " : " + entry.getValue()); 
      } 
		}
}
