package com.capgemini.lab4.inheritance;

public class Ex1TestAccount {

	public static void main(String args[])
	{
		Ex1Person p=new Ex1Person(21,"smith");
		Exercise1 a1 = new Exercise1(2000, p);
		System.out.println(a1);
		a1.deposit(2000);
	
		System.out.println();
		System.out.println("After Updated");
		System.out.println(a1);
		Ex1Person p1=new Ex1Person(25,"kathy");
		Exercise1 a2 = new Exercise1(35000.0, p1);
		System.out.println();
		System.out.println(a2);
		
		a2.withdraw(400);
	
		System.out.println();
		System.out.println("After Updated");
		System.out.println(a2);
	}
}
