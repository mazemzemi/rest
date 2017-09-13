package com.zemzemi.pilote.rest.logic.services;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import com.zemzemi.pilote.rest.logic.GlobalTestCase;
import com.zemzemi.pilote.rest.logic.services.UpdateBalanceService;

/**
 * The {@link UpdateBalanceServiceTest} test the all method of
 * {@link UpdateBalanceService}.
 * 
 * @author zemzmi
 * @since 2016-12-09.
 */
public class UpdateBalanceServiceTest extends GlobalTestCase {

	/**
	 * {@link LOGGER}.
	 */
	private static final Logger LOGGER = LogManager
			.getLogger(UpdateBalanceServiceTest.class);

	/**
	 * Create {@link UpdateBalanceService} bean.
	 */
	@Autowired
	private UpdateBalanceService updateBalanceService;

	/**
	 * Test the {@link UpdateBalanceService#addBonus(Integer)} method. <h3>
	 * Scenario1</h3> Description of Scenario1.
	 */
	@Test
	@DatabaseSetup("classpath:dataset/UpdateBalanceService.addBonus.xml")
	@ExpectedDatabase(value = "classpath:expectedDataset/UpdateBalanceService.addBonus.xml", assertionMode = DatabaseAssertionMode.NON_STRICT)
	public void addBonusSenario1() {
		LOGGER.info("Begin method UpdateBalanceService.addBonus.");
		updateBalanceService.addBonus(new BigDecimal(2000));
		LOGGER.info("End method UpdateBalanceService.addBonus.");
	}
}
