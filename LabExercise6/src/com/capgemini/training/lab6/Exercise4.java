package com.capgemini.training.lab6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class Exercise4 {
	public static Map<Integer, String> getStudents(HashMap<Integer, Integer> hm)
	{
		Map<Integer,String> res = new HashMap<>();
		for(Map.Entry<Integer, Integer> e : hm.entrySet())
		{
			int n = e.getValue();
			if(n>=90)
				res.put(e.getKey(), "Gold");
			else if(n>=80 && n<90)
				res.put(e.getKey(), "Silver");
			else if(n>=70 && n<80)
				res.put(e.getKey(), "Bronze");
			else 
				res.put(e.getKey(), "No medal");
		}
		return res;
	}
public static void main(String[] args) {
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of students: ");
	int n = sc.nextInt();
	System.out.println("Enter the marks for each Student: ");
	int m;
	for(int i =1; i<=n; i++)
	{
		m = sc.nextInt();
		hm.put(i, m);
	}
	Map<Integer,String> result = getStudents(hm);
	System.out.println("Student id : Medal earned ");
	for(Map.Entry<Integer, String> e : result.entrySet())
	{
		System.out.println(e.getKey()+" : "+e.getValue());
	}
	
	
}
}
