package com.luxoft.cdi.example07;

import javax.inject.Inject;

public class AccountCreator {

	@Inject
	@FortyfourCheckDigits
	@DeIban
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
