package com.luxoft.cdi.example23;

import javax.enterprise.event.Observes;

public class PrintService {

    public void printAccount(@Observes @Usd Account account) {
        System.out.println(String.format("Print account with balance %f",
                account.getBalance()));
    }

}
