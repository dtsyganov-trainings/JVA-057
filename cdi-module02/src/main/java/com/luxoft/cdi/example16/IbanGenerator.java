package com.luxoft.cdi.example16;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.util.Random;

@ApplicationScoped
public class IbanGenerator {

    public String generateIban() {
        return "ALT" + Math.abs(new Random().nextLong());
    }

    @Produces
    private ComplexObject сomplexObjectProducer() {
        return new ComplexObject();
    }

    private void disposeComplexObject(@Disposes ComplexObject ob) {
        ob.manualDisposeMethod();
    }

}
