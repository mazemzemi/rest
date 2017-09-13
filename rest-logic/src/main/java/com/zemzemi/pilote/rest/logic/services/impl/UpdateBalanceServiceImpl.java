package com.zemzemi.pilote.rest.logic.services.impl;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zemzemi.pilote.rest.logic.repositories.UserRepository;
import com.zemzemi.pilote.rest.logic.services.UpdateBalanceService;

/**
 * The {@link UpdateBalanceServiceImpl} java class service implements The
 * {@link UpdateBalanceService} interface.
 * 
 * @author zemzmi
 * @since 2016-12-08.
 */
@Service("updateBalanceService")
public class UpdateBalanceServiceImpl implements UpdateBalanceService {

	/**
	 * {@link LOGGER}.
	 */
	private static final Logger LOGGER = LogManager
			.getLogger(UpdateBalanceServiceImpl.class);

	/**
	 * The {@link UserRepository} bean.
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * {@inheritDoc}.
	 */
	public void addBonus(BigDecimal bonus) {
		LOGGER.info("Begin method UpdateBalanceService.addBonus.");
		userRepository.addBonus(bonus);
		LOGGER.info("End method UpdateBalanceService.addBonus.");
	}

}
