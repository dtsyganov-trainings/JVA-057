package com.luxoft.cdi.example18;

public class AccountCreator {

    @Security
    public Account createAccount(double balance) {
        Account account = new Account("DE44-123", balance);
        System.out.println("Account created");
        return account;
    }

}
