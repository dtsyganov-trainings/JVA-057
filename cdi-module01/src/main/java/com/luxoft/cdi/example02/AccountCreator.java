package com.luxoft.cdi.example02;

public class AccountCreator {

	private final IbanGenerator ibanGenerator;
	
	public AccountCreator(IbanGenerator ibanGenerator) {
		this.ibanGenerator = ibanGenerator;
	}

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
