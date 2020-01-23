package com.luxoft.cdi.example12;

import java.util.Random;

import javax.enterprise.inject.Alternative;

@Alternative
public class SwissIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
