package com.luxoft.cdi.example08;

import java.util.Random;

@IbanType(checkDigits="44")
public class GermanIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
