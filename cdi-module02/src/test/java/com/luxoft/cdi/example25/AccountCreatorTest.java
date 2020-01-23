package com.luxoft.cdi.example25;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountCreatorTest {

    private CdiContainer cdiContainer;
    private AccountCreator accountCreator;

    @Before
    public void initBeanManager() {
        Logger parent = Logger.getLogger("org");
        parent.setLevel(Level.SEVERE);

        cdiContainer = CdiContainerLoader.getCdiContainer();
        cdiContainer.boot();

        BeanManager beanManager = cdiContainer.getBeanManager();

        Set<Bean<?>> beans = beanManager.getBeans(AccountCreator.class);
        Bean<?> bean = beanManager.resolve(beans);

        accountCreator = (AccountCreator) beanManager.getReference(bean, AccountCreator.class,
                beanManager.createCreationalContext(bean));
    }

    @After
    public void closeBeanManager() {
        cdiContainer.shutdown();
    }

    @Test
    public void createAccountTest() {

        accountCreator.createAccount(100.0);
        System.out.println(accountCreator);

//		System.out.println(accountCreator.allIbanGenerators.get().generateIban());
//        System.out.println("Count: " + accountCreator.allIbanGenerators.stream().count());
//        accountCreator.allIbanGenerators.forEach(
//                g -> System.out.println(
//                        g.getClass().getSimpleName()
//                                + " : "
//                                + g.generateIban()
//                )
//        );
    }

}
