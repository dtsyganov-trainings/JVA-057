package com.luxoft.cdi.example05;

import javax.enterprise.inject.Default;
import java.util.Random;

public class NewIbanGenerator implements IbanGenerator {

    @Override
    public String generateIban() {
        return "NEW111" + Math.abs(new Random().nextLong());
    }

}
