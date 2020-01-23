package com.luxoft.cdi.example02;

import java.util.Random;

public class GermanIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
