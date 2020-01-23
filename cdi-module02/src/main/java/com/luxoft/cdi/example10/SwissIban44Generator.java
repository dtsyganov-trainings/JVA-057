package com.luxoft.cdi.example10;

import java.util.Random;

import javax.inject.Named;

@Named("CH44")
public class SwissIban44Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH44" + Math.abs(new Random().nextLong());
	}

}
