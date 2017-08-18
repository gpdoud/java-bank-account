package com.maxtrain;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings savings = new Savings("My First Savings");
		savings.deposit(1000.00);
		double interest = savings.payInterest(3);
		System.out.println(savings.display());

		Account checking = new Account("My First Checking");
		
		
		checking.setDesc("Greg's Checking");
		
		System.out.println(checking.display());
		System.out.println(savings.display());
		
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

		savings.transfer(200.0, checking);
		System.out.println(checking.display());
		System.out.println(savings.display());
	}

}
