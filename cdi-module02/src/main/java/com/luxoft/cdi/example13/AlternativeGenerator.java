package com.luxoft.cdi.example13;

import java.util.Random;

import javax.enterprise.inject.Alternative;

@Alternative
@DeIban
@FortyfourCheckDigits
public class AlternativeGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "ALT" + Math.abs(new Random().nextLong());
	}

}
