package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class DebitExpense extends Expense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Account account;
	
	public DebitExpense() {
		super();
	}

	public DebitExpense(Float value, LocalDate expenseDate, Category category, Account account) {
		super(value, expenseDate, category);
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
