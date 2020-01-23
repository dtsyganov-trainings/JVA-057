package com.luxoft.cdi.example03;

import javax.inject.Inject;

public class AccountCreator {

	private final IbanGenerator ibanGenerator;

	@Inject
	public AccountCreator(IbanGenerator ibanGenerator) {
		this.ibanGenerator = ibanGenerator;
	}

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
