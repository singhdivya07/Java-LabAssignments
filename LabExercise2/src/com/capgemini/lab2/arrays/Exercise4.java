package com.capgemini.lab2.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] e=new int[n];
		for(int i =0;i<n;i++)
		{
			e[i] = sc.nextInt();
		}
		int lenght = e.length;
		lenght= modifyArray(e);
		int temp=0;
		System.out.println("Array after removing duplicates: ");
		int rev[]= new int[lenght];
		
		//System.out.println(lenght + " " +e.length);
		for(int i =0; i<lenght; i++)
		{
			rev[i]=e[i];
			//System.out.println("hey"+rev[i]);
		}
		for(int j = rev.length-1 ; j>=0; j--)
		{
			System.out.print(rev[j]+" ");
		}

	}

	public static int modifyArray(int[] arr)
	{
		Arrays.sort(arr);
		int len= arr.length;
		if(len ==0 || len ==1)
		{
			return len;
		}
		int[] temp = new int[len];
		int j = 0;
		for(int i=0; i<len-1; i++){
			if(arr[i] != arr[i+1]){
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[len-1];
		//Changing the original array
		for(int i=0; i<j; i++){
			arr[i] = temp[i];
		}
		return j;
	}

}

