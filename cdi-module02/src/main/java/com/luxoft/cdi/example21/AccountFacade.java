package com.luxoft.cdi.example21;

public class AccountFacade implements Facade {
    private Account account;

    @Override
    public Account createAccount(double balance) {
        account = new Account("DE44-123", 100);
        return account;
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
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
