package com.capgemini.training.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Map<Integer,Integer> person_map = new HashMap<>();
	
	System.out.println("Enter the number of people:");
	int people= sc.nextInt();
	for(int i=0;i<people;i++)
	{
	System.out.println("Enter ID:");
	Integer id = sc.nextInt();
	System.out.println("Enter age");
	Integer age = sc.nextInt();
	person_map.put(id, age);
	}
	List<Integer> age = votersList(person_map);
	for(int i : age)
	{
	System.out.println("valid person for voting:"+i);
	}
	}
	static List<Integer> votersList(Map<Integer, Integer> hash)
	{
	List<Integer> l = new ArrayList<Integer>();
	for (Map.Entry<Integer, Integer> entry : hash.entrySet())
	{
	if(entry.getValue()>18)
	{
	int i = entry.getKey();
	l.add(i);
	}
	}
	return l;
	}

}