package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class CreditExpense extends Expense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer totalInstallments;
	private Integer paidInstallments;
	
	@ManyToOne
	private CreditCard creditCard;
	
	public CreditExpense() {
		super();
	}

	public CreditExpense(Float value, LocalDate expenseDate, Category category, Integer totalInstallments, Integer paidInstallments, CreditCard creditCard) {
		super(value, expenseDate, category);
		this.totalInstallments = totalInstallments;
		this.paidInstallments = paidInstallments;
		this.creditCard = creditCard;
	}

	public Integer getTotalInstallments() {
		return totalInstallments;
	}

	public void setTotalInstallments(Integer totalInstallments) {
		this.totalInstallments = totalInstallments;
	}

	public Integer getPaidInstallments() {
		return paidInstallments;
	}

	public void setPaidInstallments(Integer paidInstallments) {
		this.paidInstallments = paidInstallments;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
