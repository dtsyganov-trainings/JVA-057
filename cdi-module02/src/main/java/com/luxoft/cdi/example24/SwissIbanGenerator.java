package com.luxoft.cdi.example24;


import java.util.Random;

@ChIban
public class SwissIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
