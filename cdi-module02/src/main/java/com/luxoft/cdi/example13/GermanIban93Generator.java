package com.luxoft.cdi.example13;

import java.util.Random;

@DeIban
@NinetythreeCheckDigits
public class GermanIban93Generator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE93" + Math.abs(new Random().nextLong());
	}

}
