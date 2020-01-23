package com.luxoft.cdi.example22;

public interface Facade {

    public Account createAccount(double balance);
    public void deposit(double amount);
    public void withdraw(double amount);

}
