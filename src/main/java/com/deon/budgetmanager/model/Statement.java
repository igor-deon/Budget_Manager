package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Statement implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private OffsetDateTime statementDate;
	private OffsetDateTime dueDate;
	private Float totalValue;
	private Float paidValue;
	private boolean isPaid;
	
	@ManyToOne
	@JoinColumn(name="creditCard_id")
	private CreditCard creditCard;
	
	public Statement() {}

	public Statement(OffsetDateTime statementDate, OffsetDateTime dueDate, Float totalValue,
			Float paidValue, boolean isPaid, CreditCard creditCard) {
		super();
		this.id = null;
		this.statementDate = statementDate;
		this.dueDate = dueDate;
		this.totalValue = totalValue;
		this.paidValue = paidValue;
		this.isPaid = isPaid;
		this.creditCard = creditCard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OffsetDateTime getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(OffsetDateTime statementDate) {
		this.statementDate = statementDate;
	}

	public OffsetDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(OffsetDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public Float getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Float totalValue) {
		this.totalValue = totalValue;
	}

	public Float getPaidValue() {
		return paidValue;
	}

	public void setPaidValue(Float paidValue) {
		this.paidValue = paidValue;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statement other = (Statement) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Statement [id=" + id + ", statementDate=" + statementDate + ", dueDate=" + dueDate + ", totalValue="
				+ totalValue + ", paidValue=" + paidValue + ", isPaid=" + isPaid + "]";
	}
}
