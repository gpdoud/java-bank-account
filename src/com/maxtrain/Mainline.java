package com.maxtrain;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account checking = new Account("100", "My First Checking");
		
		double newBalance = checking.deposit(100.00);
		System.out.println("Deposit $100: Balance is " + newBalance);

		newBalance = checking.deposit(75.00);
		System.out.println("Deposit $75: Balance is " + newBalance);

		newBalance = checking.withdraw(25.00);
		System.out.println("Withdraw $25: Balance is " + newBalance);

		newBalance = checking.deposit(-100.00);
		System.out.println("Deposit -$100: Balance is " + newBalance);

		newBalance = checking.withdraw(-25.00);
		System.out.println("Withdraw -25: Balance is " + newBalance);

		newBalance = checking.withdraw(250.00);
		System.out.println("Withdraw $250: Balance is " + newBalance);

	}

}
