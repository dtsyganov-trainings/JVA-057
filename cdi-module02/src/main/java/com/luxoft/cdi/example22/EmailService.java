package com.luxoft.cdi.example22;

import javax.enterprise.event.Observes;

public class EmailService {

    public void emailAccountInfo(Account account) {
        System.out.println(String.format("Send email about account with balance %f",
                account.getBalance()));
    }
}