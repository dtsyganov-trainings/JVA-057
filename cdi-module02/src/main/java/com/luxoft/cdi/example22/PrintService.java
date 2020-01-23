package com.luxoft.cdi.example22;

import javax.enterprise.event.Observes;

public class PrintService {

    public void printAccount(@Observes Account account) {
        System.out.println(String.format("Print account with balance %f",
                account.getBalance()));
    }

}
