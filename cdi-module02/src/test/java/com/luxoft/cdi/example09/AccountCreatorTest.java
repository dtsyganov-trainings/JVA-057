package com.luxoft.cdi.example09;

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

import static org.junit.Assert.assertTrue;

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
	public void createGermanAccountTest() {

		Account account = accountCreator.createAccount(0.0);

		System.out.println("iban = " + account.getIban());
		assertTrue(account.getIban().startsWith("DE44"));
	}

}
