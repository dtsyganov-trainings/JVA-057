package com.luxoft.cdi.example03;

import java.util.Random;

public class IbanGenerator {

	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}


}
