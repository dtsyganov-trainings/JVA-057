package com.luxoft.cdi.example07;

import java.util.Random;

@DeIban @Code93
public class GermanIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE93" + Math.abs(new Random().nextLong());
	}

}
