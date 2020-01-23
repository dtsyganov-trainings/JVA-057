package com.luxoft.cdi.example12;

import java.util.Random;

public class GermanIbanGenerator implements IbanGenerator {
	static {
		System.out.println("GermanIbanGenerator");
	}

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
