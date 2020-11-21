package com.capgemini.lab2.arrays;
import java.util.*;
public class Exercise2 {
	public static void main(String[] args) {
		int count ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Strings: ");
		count = sc.nextInt();
		sc.nextLine();
		String[] str = new String[count];
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
		sc.close();
		scan2.close();
		Exercise2 obj = new Exercise2();
		obj.sortStrings(str);
		System.out.println("Sorted String :");
		for(int i =0; i<count;i++)
		{
		System.out.println(str[i]);
		}
		
	}
private  String sortStrings(String arr[])
{
	String temp;
	for (int i = 0; i < arr.length; i++) 
    {
        for (int j = i + 1; j < arr.length; j++) 
        { 
            if (arr[i].compareTo(arr[j]) > 0) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
	int mid;
	if(arr.length % 2 !=0)
	{
		mid= arr.length/2 +1;
	}
	else
	{
		mid= arr.length/2;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(i<mid)
			arr[i]=arr[i].toUpperCase();
		else
			arr[i]=arr[i].toLowerCase();
	}
	String a = Arrays.toString(arr);
	return a;
     
	
	}
}
