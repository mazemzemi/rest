package com.zemzemi.pilote.rest.logic;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

/**
 * Abstract class for Test classes.
 * <p>
 * All test classes must inherit this class.
 * 
 * @author zemzmi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextTest.xml")
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
@DbUnitConfiguration(dataSetLoader = RestDataSetLoader.class)
@Ignore
public class GlobalTestCase {

	/**
	 * Default logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalTestCase.class);

	/**
	 * Constructor.
	 * 
	 */
	protected GlobalTestCase() {
		super();
	}

	/**
	 * Memory dump.
	 */
	@AfterClass
	public static void afterClass() {

		LOGGER.info("Free memory  : " + Runtime.getRuntime().freeMemory());
		LOGGER.info("Max memory   : " + Runtime.getRuntime().maxMemory());
		LOGGER.info("Total memory : " + Runtime.getRuntime().totalMemory());
	}
}
