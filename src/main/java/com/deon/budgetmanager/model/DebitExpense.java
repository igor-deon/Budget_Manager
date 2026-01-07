package com.deon.budgetmanager.model;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DEBIT_EXPENSE")
public class DebitExpense extends Expense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public DebitExpense() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
