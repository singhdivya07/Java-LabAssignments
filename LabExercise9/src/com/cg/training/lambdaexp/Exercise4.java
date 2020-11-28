package com.cg.training.lambdaexp;
interface Student
{
	Person get(String name);
	
	}

class Person{
	private String name;
	Person()
	{
		System.out.println("Default Constructor");
	}
	Person(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "name: "+name;
	}
}
public class Exercise4 {
	
public static void main(String[] args) {
	 Student obj = Person :: new;
	System.out.println(obj.get("Divya"));
}
}
