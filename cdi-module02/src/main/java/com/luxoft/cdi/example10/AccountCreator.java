package com.luxoft.cdi.example10;

import javax.inject.Inject;
import javax.inject.Named;

public class AccountCreator {

	@Inject
	@Named("DE44")
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
