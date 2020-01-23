package com.luxoft.cdi.example08;

import java.util.Random;

@IbanType(countryCode="CH", checkDigits="93")
public class SwissIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
