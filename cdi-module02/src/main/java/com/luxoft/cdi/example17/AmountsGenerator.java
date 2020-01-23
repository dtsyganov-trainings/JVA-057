package com.luxoft.cdi.example17;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

public class AmountsGenerator {
    @Produces
    @Balance
    private double balance = 0.10;

    @Produces
    @Balance
    @Alternative
    private double altBalance = 10.00;

    @Produces
    @Overdraft
    private double overdraft = 0.10;

    @Produces
    @Overdraft
    @Alternative
    private double altOverdraft = 50.00;

}
