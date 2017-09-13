package com.zemzemi.pilote.rest.logic.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.zemzemi.pilote.rest.logic.model.User;

/**
 * The {@link UserRepository} interface extends from {@link JpaRepository}.
 * 
 * @author zemzmi
 * @since 2016-12-08.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Update balance of {@link User} where balance greater than 5000.
	 * 
	 * @param bonus
	 */
	@Modifying
	@Query("UPDATE User ur SET ur.balance = ur.balance + :bonus WHERE ur.balance > 5000")
	@Transactional
	public void addBonus(@Param("bonus") BigDecimal bonus);
}
