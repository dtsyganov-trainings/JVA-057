package com.luxoft.cdi.example11.aaa;

import com.luxoft.cdi.example11.IbanGenerator;

import java.util.Random;

import javax.enterprise.inject.Vetoed;

//@Vetoed
public class SwissIbanGenerator implements IbanGenerator {

	@Override
	public String generateIban() {
		return "CH93" + Math.abs(new Random().nextLong());
	}

}
