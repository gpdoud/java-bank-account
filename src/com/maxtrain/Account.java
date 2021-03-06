package com.maxtrain;

public class Account {
	static int nextNbr = 1;
	// all the properties
	private double balance; // holds the amount in the account
	private String nbr; // account number
	private String desc; // user-defined name
	
	public String getNbr() {
		return this.nbr;
	}
	private void setNbr(String nbr) {
		this.nbr = nbr;
	}
	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getBalance() {
		return this.balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	// constructor
	public Account(String desc) {
		this.setNbr(String.valueOf(nextNbr));
		nextNbr++;
		//this.desc = desc;
		this.setDesc(desc);
		this.setBalance(0);
	}
	
	public Boolean transfer(double amount, Account toAccount) {
		if(this.getBalance() < amount || amount <= 0) {
			return false;
		}
		this.withdraw(amount);
		toAccount.deposit(amount);
		System.out.println("Successful transfer of " + amount);
		return true;
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
	
	public String display() {		
		return "Account: nbr is " + this.getNbr() 
				+ ", desc is " + this.getDesc() 
				+ ", balance is " + this.getBalance();
		
	}
}
