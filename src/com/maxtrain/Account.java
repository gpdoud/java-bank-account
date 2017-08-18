package com.maxtrain;

public class Account {
	// all the properties
	private double balance; // holds the amount in the account
	private String nbr; // account number
	private String desc; // user-defined name
	
	public Account(String nbr, String desc) {
		this.nbr = nbr;
		this.desc = desc;
		this.balance = 0;
	}
	
	public double deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Deposit amount must be greater than zero");
			return this.balance;
		}
		this.balance += amount;
		return this.balance;
	}
	
	public double withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Withdraw amount must be greater than zero");
			return this.balance;
		}
		if(amount > this.balance) {
			System.out.println("Insufficient funds!");
			return this.balance;
		}
		this.balance -= amount;
		return this.balance;
	}
}
