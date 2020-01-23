package com.luxoft.cdi.example15;

import javax.inject.Inject;

@Parent
public class AccountCreator {

	@Inject
	private IbanGenerator ibanGenerator;

	@Inject
	public String oneSting;

	@Inject
	public String anotherSting;

	private String logger;

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

	public IbanGenerator getIbanGenerator() {
		return ibanGenerator;
	}

	public String getLogger() {
		return oneSting;
	}

	@Inject
	public void setLogger(String logger) {
		this.logger = logger;
	}



}
