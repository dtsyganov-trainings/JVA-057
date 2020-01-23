package com.luxoft.cdi.example08;

import java.util.Random;

@IbanType(countryCode="CH", checkDigits="44")
public class SwissIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH44" + Math.abs(new Random().nextLong());
	}

}
