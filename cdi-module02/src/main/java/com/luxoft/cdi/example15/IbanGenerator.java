package com.luxoft.cdi.example15;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.Random;

public class IbanGenerator {

    public String generateIban() {
        return "ALT" + Math.abs(new Random().nextLong());
    }

    @Produces
    public String someString(InjectionPoint ip) {
        return ip.getBean().getBeanClass().getName() + "." +
                ip.getMember().getName();
    }


}
