package com.luxoft.cdi.example07;

import java.util.Random;

@DeIban
@SevetysevenCheckDigits
public class GermanIban77Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE77" + Math.abs(new Random().nextLong());
	}

}
