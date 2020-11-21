package com.capgemini.lab4.inheritance;
public class Exercise1 {

	private Ex1Person p;
	private long accNum;
	protected double balance;
	private Ex1Person accHolder;
	private static final int Min_Acc_Bal=500;
	static int autogen;

	static {
		autogen = 101;
	}

	public Exercise1(double balance, Ex1Person accHolder) {
		super();
		this.accNum = autogen++;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount)
	{
	
		 if(amount<=(balance-Min_Acc_Bal)) balance-=amount; else
		 System.out.println("Insufficint balance'");
		 

	}

	public String toString() {
		return "Account_No:" + accNum + "\nBalance:" + balance + "\nAccountHolderName:" + accHolder.getName()+"\nAge:"+accHolder.getAge();
	}
	

}
