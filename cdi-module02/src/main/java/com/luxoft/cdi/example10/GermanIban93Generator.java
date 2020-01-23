package com.luxoft.cdi.example10;

import java.util.Random;

import javax.inject.Named;

@Named("DE93")
public class GermanIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE93" + Math.abs(new Random().nextLong());
	}

}
