package com.luxoft.cdi.example02;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountCreatorTest {

	@Test
	public void createGermanAccountTest() {

		Account account = new AccountCreator(new GermanIbanGenerator()).createAccount(0.0);

		System.out.println("iban = " + account.getIban());
		assertTrue(account.getIban().startsWith("DE44"));
	}

	@Test
	public void createSwissAccountTest() {

		Account account = new AccountCreator(new SwissIbanGenerator()).createAccount(0.0);

		System.out.println("iban = " + account.getIban());
		assertTrue(account.getIban().startsWith("CH93"));
	}


	@Test
	public void accountCreatorTest() {

		Account account = new AccountCreator(() -> "FAKE STR").createAccount(0.0);

		System.out.println("iban = " + account.getIban());
		assertTrue(account.getIban().startsWith("FAKE STR"));
	}



}
