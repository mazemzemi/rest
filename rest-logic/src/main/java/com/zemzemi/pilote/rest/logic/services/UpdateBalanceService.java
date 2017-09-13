package com.zemzemi.pilote.rest.logic.services;

import java.math.BigDecimal;

import com.zemzemi.pilote.rest.logic.model.User;

/**
 * The {@link UpdateBalanceService} interface.
 * 
 * @author zemzmi
 * @since 2016-12-08.
 */
public interface UpdateBalanceService {

	/**
	 * Update balance of {@link User} where balance greater than 5000.
	 * 
	 * @param bonus
	 */
	public void addBonus(BigDecimal bonus);

}
