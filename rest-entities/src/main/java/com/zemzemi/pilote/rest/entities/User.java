package com.zemzemi.pilote.rest.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * {@link User} java class.
 * 
 * @author zemzmi
 * @since 2016-12-05.
 *
 */
public class User implements Serializable {

	/**
	 * {@link User#serialVersionUID} attribute.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * {@link User#userId} attribute.
	 */
	private Long userId;

	/**
	 * {@link User#name} attribute.
	 */
	private String name;

	/**
	 * {@link User#birthday} attribute.
	 */
	private Date birthday;

	/**
	 * {@link User#activateDate} attribute.
	 */
	private Date activateDate;

	/**
	 * {@link User#serialNumber} attribute.
	 */
	private String serialNumber;

	/**
	 * {@link User#balance} attribute.
	 */
	private BigDecimal balance;

	/**
	 * {@link User#phoneNumber} attribute.
	 */
	private Integer phoneNumber;

	/**
	 * {@link User} default constructor using the design pattern builder.
	 * 
	 * @param builder
	 *            allowed object is {@link Builder }.
	 */
	public User(Builder builder) {

		this.userId = builder.userId;
		this.name = builder.name;
		this.birthday = builder.birthday;
		this.activateDate = builder.activateDate;
		this.phoneNumber = builder.phoneNumber;
		this.serialNumber = builder.serialNumber;
		this.balance = builder.balance;

		// Assert.notNull(name, "The name must not be null");
		// Assert.notNull(serialNumber, "The serialNumber must not be null");
		// Assert.notNull(phoneNumber, "The phoneNumber must not be null");

	}

	/**
	 * Gets the value of the property {@link User#userId}.
	 * 
	 * @return possible object is {@link Long }.
	 * 
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Gets the value of the property {@link User#name}.
	 * 
	 * @return possible object is {@link String }.
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the value of the property {@link User#birthday}.
	 * 
	 * @return possible object is {@link String }.
	 * 
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * Gets the value of the property {@link User#balance}.
	 * 
	 * @return possible object is {@link BigDecimal }.
	 * 
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * Gets the value of the property {@link User#serialNumber}.
	 * 
	 * @return possible object is {@link String }.
	 * 
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Gets the value of the property {@link User#phoneNumber}.
	 * 
	 * @return possible object is {@link Integer }.
	 * 
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Gets the value of the property {@link User#activateDate}.
	 * 
	 * @return possible object is {@link Date }.
	 * 
	 */
	public Date getActivateDate() {
		return activateDate;
	}

	/**
	 * Static {@link Builder} class.
	 * 
	 * @author zemzmi
	 *
	 */
	public static class Builder {

		/**
		 * {@link Builder#userId} attribute.
		 */
		protected Long userId;

		/**
		 * {@link Builder#name} attribute.
		 */
		protected String name;

		/**
		 * {@link Builder#birthday} attribute.
		 */
		protected Date birthday;

		/**
		 * {@link User#activateDate} attribute.
		 */
		protected Date activateDate;

		/**
		 * {@link User#serialNumber} attribute.
		 */
		protected String serialNumber;

		/**
		 * {@link User#balance} attribute.
		 */
		protected BigDecimal balance;

		/**
		 * {@link User#availableService} attribute.
		 */
		protected List<String> availableService;

		/**
		 * {@link User#phoneNumber} attribute.
		 */
		protected Integer phoneNumber;

		/**
		 * Sets the value of the property {@link Builder#userId}.
		 * 
		 * @param value
		 *            allowed object is {@link Long }.
		 */
		public Builder userId(Long value) {
			this.userId = value;
			return this;
		}

		/**
		 * Sets the value of the property {@link Builder#name}.
		 * 
		 * @param value
		 *            allowed object is {@link String }.
		 */
		public Builder name(String value) {
			this.name = value;
			return this;

		}

		/**
		 * Sets the value of the property {@link Builder#birthday}.
		 * 
		 * @param value
		 *            allowed object is {@link Date }.
		 */
		public Builder birthday(Date value) {
			this.birthday = value;
			return this;
		}

		/**
		 * Sets the value of the property {@link Builder#activateDate}.
		 * 
		 * @param value
		 *            allowed object is {@link Date }.
		 */
		public Builder activateDate(Date value) {
			this.activateDate = value;
			return this;
		}

		/**
		 * Sets the value of the property {@link Builder#balance}.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }.
		 */
		public Builder balance(BigDecimal value) {
			this.balance = value;
			return this;
		}

		/**
		 * Sets the value of the property {@link Builder#phoneNumber}.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }.
		 */
		public Builder phoneNumber(Integer value) {
			this.phoneNumber = value;
			return this;
		}

		/**
		 * Sets the value of the property {@link Builder#serialNumber}.
		 * 
		 * @param value
		 *            allowed object is {@link String }.
		 */
		public Builder serialNumber(String value) {
			this.serialNumber = value;
			return this;
		}

	}

}
