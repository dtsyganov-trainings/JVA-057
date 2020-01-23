package com.luxoft.cdi.example24;

import java.util.Random;

@DeIban
public class GermanIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
