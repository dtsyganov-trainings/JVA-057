package com.luxoft.cdi.example01;

public class AccountCreator {

	private IbanGenerator ibanGenerator;
	
	public AccountCreator(IbanGenerator ibanGenerator) {
		this.ibanGenerator = ibanGenerator;
	}

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
