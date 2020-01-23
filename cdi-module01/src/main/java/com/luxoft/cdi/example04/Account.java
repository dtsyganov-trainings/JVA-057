package com.luxoft.cdi.example04;

public class Account {
	
	private String iban;
	private double balance;

	public Account(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
	}
	
	public String getIban() {
		return iban;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(final double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	public void withdraw(double amount){
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		
		if (amount > balance) {
			throw new IllegalArgumentException("Cannot withdraw an amount larger than the balance");
		}
		
		this.balance -= amount;
	}

}
