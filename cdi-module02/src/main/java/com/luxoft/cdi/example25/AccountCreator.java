package com.luxoft.cdi.example25;

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

	@Inject @Any
	Instance<IbanGenerator> allIbanGenerators;

	public Account createAccount(double balance) {
		return new Account(germanIbanGenerator.get().generateIban(), balance);
	}

	@Override
	public String toString() {
		return "AccountCreator{" +
				"germanIbanGenerator=" + germanIbanGenerator +
				",\n swissIbanGenerator=" + swissIbanGenerator +
				",\n allIbanGenerators=" + allIbanGenerators +
				",\n allIbanGenerators amb=" + allIbanGenerators.isAmbiguous() +
				'}';
	}
}
