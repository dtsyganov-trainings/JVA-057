package com.luxoft.cdi.example09;

import javax.inject.Inject;
import javax.inject.Named;

public class AccountCreator {

	@Inject
	@Named("germanIban44Generator")
	private IbanGenerator ibanGenerator;
	
	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
