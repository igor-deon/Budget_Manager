package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CreditCard implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Float limit;
	private Integer statementDay;
	private Integer dueDay;
	
	@ManyToOne
	private Account account;
	@OneToMany
	private List<Statement> statements = new ArrayList<>();
	@OneToMany
	private List<CreditExpense> expenses = new ArrayList<>();
	
	public CreditCard() {}
	
	public CreditCard(String name, Float limit, Integer statementDay, Integer dueDay,
			Account account) {
		super();
		this.id = null;
		this.name = name;
		this.limit = limit;
		this.statementDay = statementDay;
		this.dueDay = dueDay;
		this.account = account;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Float getLimit() {
		return limit;
	}
	
	public void setLimit(Float limit) {
		this.limit = limit;
	}
	
	public Integer getStatementDay() {
		return statementDay;
	}

	public void setStatementDay(Integer statementDay) {
		this.statementDay = statementDay;
	}

	public Integer getDueDay() {
		return dueDay;
	}

	public void setDueDay(Integer dueDay) {
		this.dueDay = dueDay;
	}

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Statement> getStatements() {
		return statements;
	}
	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}
	
	public List<CreditExpense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<CreditExpense> expenses) {
		this.expenses = expenses;
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
		CreditCard other = (CreditCard) obj;
		return Objects.equals(id, other.id);
	}
}
