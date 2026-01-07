package com.deon.budgetmanager.model;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("INCOME")
public abstract class Income extends Transaction implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Income() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
