package com.capgemini.training.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
public static int getSecondSmallest(int[] arr)
{
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	for(int i =0;i<arr.length;i++)
	{
		arraylist.add(new Integer(arr[i]));

	}
	Collections.sort(arraylist);
	//System.out.println(arraylist);
	
	return arraylist.get(1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array:");
	int n = sc.nextInt();
	System.out.println("Enter elements: ");
	int ele[] = new int[n];
	for(int i=0; i<n;i++)
	{
		ele[i] = sc.nextInt();
	}
	int result = getSecondSmallest(ele);
	System.out.println("Second smallest :"+result);
}
}
