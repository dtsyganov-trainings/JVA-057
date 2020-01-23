package com.luxoft.cdi.example23;

import javax.enterprise.event.Observes;

public class EmailService {

    public void emailAccountInfo(@Observes @Eur Account account) {
        System.out.println(String.format("Send email about account with balance %f",
                account.getBalance()));
    }
}