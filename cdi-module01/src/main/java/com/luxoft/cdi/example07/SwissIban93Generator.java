package com.luxoft.cdi.example07;

import java.util.Random;

@ChIban @Code93
public class SwissIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
