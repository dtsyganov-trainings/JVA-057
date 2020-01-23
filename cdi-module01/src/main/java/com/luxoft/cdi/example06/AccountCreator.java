package com.luxoft.cdi.example06;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AccountCreator {

	@Inject
	private IbanGenerator ibanGenerator;
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("AccountCreator bean constructed");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("AccountCreator bean destroyed");
	}

	public Account createAccount(double balance) {
		return new Account(ibanGenerator.generateIban(), balance);
	}

}
