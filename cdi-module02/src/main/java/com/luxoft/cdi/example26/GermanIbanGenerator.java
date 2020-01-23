package com.luxoft.cdi.example26;


import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ApplicationScoped
public class GermanIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "DE44" + Math.abs(new Random().nextLong());
	}

}
