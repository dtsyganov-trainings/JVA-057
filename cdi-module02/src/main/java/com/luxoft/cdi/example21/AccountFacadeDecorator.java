package com.luxoft.cdi.example21;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public abstract class AccountFacadeDecorator
        implements Facade {

    @Inject
    @Delegate
    private Facade accountFacade;

    @Override
    public void deposit(double amount) {
        accountFacade.deposit(1.05 * amount);
    }
}
