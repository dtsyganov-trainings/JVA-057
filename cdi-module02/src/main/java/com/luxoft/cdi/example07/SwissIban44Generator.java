package com.luxoft.cdi.example07;

import java.util.Random;

@ChIban
@FortyfourCheckDigits
public class SwissIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH44" + Math.abs(new Random().nextLong());
	}

}
