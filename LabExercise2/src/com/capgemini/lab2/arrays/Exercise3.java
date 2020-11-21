package com.capgemini.lab2.arrays;
import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		int count ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements: ");
		count = sc.nextInt();
		int[] ele = new int[count];

		System.out.println("Enter elements: ");
		for(int i=0; i<count;i++)
		{
			ele[i] = sc.nextInt();
		}
		int[] last = getSorted(ele);
		System.out.println("Array in sorted order : "+Arrays.toString(last));
		
	}
private static int[] getSorted(int arr[])
{
	int[] rev = new int[arr.length];
	int k=  arr.length;
	for (int i = 0; i < arr.length; i++) 
    {
        rev[k-1]= arr[i];
        k=k-1;
    }
	System.out.println("Array in reverse order: "+Arrays.toString(rev));
	Arrays.sort(rev);
	return rev;
     
	
	}
}
