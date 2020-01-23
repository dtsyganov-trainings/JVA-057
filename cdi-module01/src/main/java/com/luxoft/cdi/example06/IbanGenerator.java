package com.luxoft.cdi.example06;

import java.util.Random;

public class IbanGenerator {

	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
