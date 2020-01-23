package com.luxoft.cdi.example07;

import java.util.Random;

@ChIban
@SevetysevenCheckDigits
public class SwissIban77Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH77" + Math.abs(new Random().nextLong());
	}

}
