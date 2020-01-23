package com.luxoft.cdi.example09;

import java.util.Random;

import javax.inject.Named;

@Named
public class GermanIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE93" + Math.abs(new Random().nextLong());
	}

}
