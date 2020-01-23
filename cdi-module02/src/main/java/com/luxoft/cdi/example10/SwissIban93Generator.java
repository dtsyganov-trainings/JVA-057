package com.luxoft.cdi.example10;

import java.util.Random;

import javax.inject.Named;

@Named("CH93")
public class SwissIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
