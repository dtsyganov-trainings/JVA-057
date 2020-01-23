package com.luxoft.cdi.example08;

import java.util.Random;

@IbanType(countryCode="DE", checkDigits="93")
public class GermanIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE93" + Math.abs(new Random().nextLong());
	}

}
