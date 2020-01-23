package com.luxoft.cdi.example22;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class AccountFacade implements Facade {
    @Inject
    private Event<Account> accountEvent;

    private Account account;

    @Override
    public Account createAccount(double balance) {
        account = new Account("DE44-123", 100);
        accountEvent.fire(account);
        return account;
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
        accountEvent.fire(account);
    }

    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
        accountEvent.fire(account);
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "AccountFacade{" +
                "account=" + account +
                '}';
    }
}
