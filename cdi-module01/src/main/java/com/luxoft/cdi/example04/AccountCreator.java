package com.luxoft.cdi.example04;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

public class AccountCreator {

	@Inject @Default
	private IbanGenerator ibanGenerator;

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
