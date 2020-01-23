package com.luxoft.cdi.example08;

import javax.inject.Inject;

public class AccountCreator {

	@Inject
	@IbanType(countryCode = "DE", checkDigits="44")
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
