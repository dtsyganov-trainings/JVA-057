package com.luxoft.cdi.example16;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AccountCreator {

	@Inject
	private IbanGenerator ibanGenerator;

	@Inject
	private ComplexObject complexObject;

	@Inject
	private ComplexObject complexObject2;

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

	public ComplexObject getComplexObject() {
		return complexObject;
	}

	public ComplexObject getComplexObject2() {
		return complexObject2;
	}

	public IbanGenerator getIbanGenerator() {
		return ibanGenerator;
	}

}
