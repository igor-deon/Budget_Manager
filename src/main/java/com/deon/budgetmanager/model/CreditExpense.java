package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CREDIT_EXPENSE")
public class CreditExpense extends Expense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer totalInstallments;
	private Integer paidInstallments;
	private LocalDate dueDate;
	
	public CreditExpense() {
		super();
	}
	
	public CreditExpense(Integer totalInstallments, Integer paidInstallments, LocalDate dueDate) {
		super();
		this.totalInstallments = totalInstallments;
		this.paidInstallments = paidInstallments;
		this.dueDate = dueDate;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
}
