package com.luxoft.cdi.example26;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class GeneratorsProducer {
    @Produces
    @DeIban
    public IbanGenerator createGermanGenerator(@New GermanIbanGenerator ibanGenerator) {
        return ibanGenerator;
    }

}
