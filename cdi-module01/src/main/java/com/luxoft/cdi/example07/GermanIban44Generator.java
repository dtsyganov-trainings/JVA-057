package com.luxoft.cdi.example07;

import java.util.Random;

@DeIban @Code44
public class GermanIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
