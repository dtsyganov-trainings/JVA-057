package com.luxoft.cdi.example22;

import javax.enterprise.event.Observes;

public class GoGoService {

    public void goGoAccount(Account account) {
        account.deposit(account.getBalance());
        System.out.println(String.format("GoGo account with balance %f",
                account.getBalance()));
    }

    public void goGo2Account(Account account) {
        goGoAccount(account);
    }

}
