package com.luxoft.cdi.example12;

import javax.enterprise.inject.Alternative;
import java.util.Random;
@Alternative
public class DummyIbanGenerator implements IbanGenerator {
	static {
		System.out.println("DummyIbanGenerator");
	}

	@Override
	public String generateIban() {
		return "DUMMY";
	}

}
