package com.luxoft.cdi.example26;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AccountCreator {

	@Inject
	@DeIban
	private IbanGenerator germanIbanGenerator;

	@Inject
	@DeIban
	private IbanGenerator anotherGermanIbanGenerator;

	public Account createAccount(double balance) {
		return new Account(germanIbanGenerator.generateIban(), balance);
	}

	@Override
	public String toString() {
		return "AccountCreator{" +
				"germanIbanGenerator=" + germanIbanGenerator +
				",\n anotherGermanIbanGenerator=" + anotherGermanIbanGenerator +
				'}';
	}
}
