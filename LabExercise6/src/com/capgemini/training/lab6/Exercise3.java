package com.capgemini.training.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int n = sc.nextInt();
	int[] num = new int[n];
	System.out.println("Enter the elements in the array:");
	for(int i =0; i<n;i++)
	{
		num[i] = sc.nextInt();
	}
	HashMap<Integer,Integer> result = (HashMap<Integer, Integer>) getSquares(num);
	for(Map.Entry entry : result.entrySet())
	{
        System.out.println(entry.getKey() + " : " + entry.getValue()); 

	}
	
}
public static Map<Integer, Integer> getSquares(int[] arr)
{
	HashMap map = new HashMap<Integer, Integer>();
	for(int a: arr)
	{
	map.put(a, a*a);	
	}
	return map;
	}
}
