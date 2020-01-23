package com.luxoft.cdi.example19;

public class AccountCreator {

    private Account account;

    @Loggable
    public Account createAccount(double balance) {
        account = new Account("DE44-", balance);
        return account;
    }

    @Loggable(debug = true)
    @Security
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

}
