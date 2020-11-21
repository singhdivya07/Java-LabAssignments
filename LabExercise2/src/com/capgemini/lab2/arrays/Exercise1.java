package com.capgemini.lab2.arrays;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		int ele[]= new int[n];
		System.out.println("Enter the elements in an array: ");
		for(int i=0; i < n ;i++)
		{
		ele[i]=sc.nextInt();
		}
		System.out.println("Second smallest element is : "+getSecondSmallest(ele));

	}
private static int getSecondSmallest(int arr[])
{
	int temp;
	for(int i =0 ; i< arr.length;i++)
	{
		for(int j = i +1; j<arr.length;j++)
		{
			if(arr[i] > arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	return arr[1];
	}

}
