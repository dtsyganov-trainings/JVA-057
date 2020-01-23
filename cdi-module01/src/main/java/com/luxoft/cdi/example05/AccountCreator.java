package com.luxoft.cdi.example05;

import javax.inject.Inject;

public class AccountCreator {

	@Inject @DeIban
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
