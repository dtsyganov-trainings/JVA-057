package com.luxoft.cdi.example02;

import java.util.Random;

public class SwissIbanGenerator  implements IbanGenerator {
	
	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
