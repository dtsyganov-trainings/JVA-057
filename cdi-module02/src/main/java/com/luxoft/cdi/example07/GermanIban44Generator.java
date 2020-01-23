package com.luxoft.cdi.example07;

import java.util.Random;

@DeIban
@FortyfourCheckDigits
public class GermanIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
