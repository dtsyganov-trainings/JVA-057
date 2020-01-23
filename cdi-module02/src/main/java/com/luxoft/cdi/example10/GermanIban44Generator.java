package com.luxoft.cdi.example10;

import java.util.Random;

import javax.inject.Named;

@Named("DE44")
public class GermanIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
