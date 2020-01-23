package com.luxoft.cdi.example14;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import java.util.Random;

@ApplicationScoped
public class IbanGenerator {

    public String generateIban() {
        return "ALT" + Math.abs(new Random().nextLong());
    }

    @Produces
    private final int newInt = Math.abs(new Random().nextInt());

    @Produces
    public long bban() {
        return Math.abs(new Random().nextLong());
    }

    public int getNewInt() {
        return newInt;
    }
}
