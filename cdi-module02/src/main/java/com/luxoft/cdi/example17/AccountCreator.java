package com.luxoft.cdi.example17;

import javax.inject.Inject;

public class AccountCreator {

    @Inject
    @Balance
    private double balance;

    @Inject
    @Overdraft
    private double overdraft;

    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void createAccount() {
        System.out.println("Account Created with parameters:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "AccountCreator{" +
                "balance=" + balance +
                ", overdraft=" + overdraft +
                '}';
    }
}
