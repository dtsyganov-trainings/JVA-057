package com.luxoft.cdi.example12;

import javax.inject.Inject;

public class AccountCreator {

	@Inject
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
