package com.luxoft.cdi.example24;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class AccountCreator {

	@Inject
	@DeIban
	private Instance<IbanGenerator> germanIbanGenerator;

	@Inject
	@ChIban
	private Instance<IbanGenerator> swissIbanGenerator;

	public Account createAccount(double balance) {
		return new Account(swissIbanGenerator.get().generateIban(), balance);
	}

	@Override
	public String toString() {
		return "AccountCreator{" +
				"germanIbanGenerator=" + germanIbanGenerator +
				",\n swissIbanGenerator=" + swissIbanGenerator +
				'}';
	}
}
