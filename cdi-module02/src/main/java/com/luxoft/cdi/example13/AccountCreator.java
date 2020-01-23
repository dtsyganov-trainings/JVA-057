package com.luxoft.cdi.example13;

import javax.inject.Inject;

public class AccountCreator {

	@Inject
	@ChIban
	@FortyfourCheckDigits
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
