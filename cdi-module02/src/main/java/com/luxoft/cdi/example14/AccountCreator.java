package com.luxoft.cdi.example14;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

public class AccountCreator {

	@Inject
	private IbanGenerator ibanGenerator;

	@Inject
	private long bban;
	@Inject
	private long bban2;

	@Inject
	private int newInt;
	@Inject
	private int newInt2;

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

	public long getBban() {
		return bban;
	}

	public long getBban2() {
		return bban2;
	}

	public int getNewInt() {
		return newInt;
	}

	public int getNewInt2() {
		return newInt2;
	}

	public IbanGenerator getIbanGenerator() {
		return ibanGenerator;
	}
}
