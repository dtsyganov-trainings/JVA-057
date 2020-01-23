package com.luxoft.cdi.example01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountCreatorTest {

	@Test
	public void createAccountTest() {

		Account account = new AccountCreator(new IbanGenerator()).createAccount(0.0);

		System.out.println("iban = " + account.getIban());
		assertTrue(account.getIban().startsWith("DE44"));
	}

}
