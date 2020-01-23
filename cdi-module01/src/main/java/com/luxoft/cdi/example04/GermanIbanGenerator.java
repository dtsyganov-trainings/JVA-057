package com.luxoft.cdi.example04;

import javax.enterprise.inject.Default;
import java.util.Random;

@Default
public class GermanIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
