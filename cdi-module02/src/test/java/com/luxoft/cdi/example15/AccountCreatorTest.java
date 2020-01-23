package com.luxoft.cdi.example15;

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
	private AccountCreatorChild accountCreatorChild;

	@Before
	public void initBeanManager() {
		Logger parent = Logger.getLogger("org");
		parent.setLevel(Level.SEVERE);

		cdiContainer = CdiContainerLoader.getCdiContainer();
		cdiContainer.boot();

		BeanManager beanManager = cdiContainer.getBeanManager();

		Set<Bean<?>> beans = beanManager.getBeans(AccountCreator.class, AccountCreator.class.getAnnotation(Parent.class));
		Bean<?> bean = beanManager.resolve(beans);
		Set<Bean<?>> beans2 = beanManager.getBeans(AccountCreatorChild.class);
		Bean<?> bean2 = beanManager.resolve(beans2);

		accountCreator = (AccountCreator) beanManager.getReference(bean, AccountCreator.class,
				beanManager.createCreationalContext(bean));
		accountCreatorChild = (AccountCreatorChild) beanManager.getReference(bean2, AccountCreatorChild.class,
				beanManager.createCreationalContext(bean2));
	}

	@After
	public void closeBeanManager() {
		cdiContainer.shutdown();
	}

	@Test
	public void createGermanAccountTest() {

		Account account = accountCreator.createAccount(0.0);
		System.out.println(accountCreator.getLogger());
		System.out.println(accountCreatorChild.getLogger());


		System.out.println("iban = " + account.getIban());
//		assertTrue(account.getIban().startsWith("DE44"));
	}

}
