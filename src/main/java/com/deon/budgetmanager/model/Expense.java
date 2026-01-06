package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer totalInstallments;
	private Integer paidInstallments;
	private Float ExpenseValue;
	private LocalDate expenseDate;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	@ManyToOne
	@JoinColumn(name="creditCard_id")
	private CreditCard creditCard;
	
	public Expense() {
		super();
	}

	public Expense(Float ExpenseValue, LocalDate expenseDate, Category category, Account account) {
		super();
		this.id = null;
		this.ExpenseValue = ExpenseValue;
		this.expenseDate = expenseDate;
		this.category = category;
		this.account = account;
		this.creditCard = null;
		this.totalInstallments = 1;
		this.paidInstallments = 1;
	}
	
	public Expense(Float ExpenseValue, LocalDate expenseDate, Category category, CreditCard creditCard, Integer totalInstallments, Integer paidInstallments) {
		super();
		this.id = null;
		this.ExpenseValue = ExpenseValue;
		this.expenseDate = expenseDate;
		this.category = category;
		this.account = null;
		this.creditCard = creditCard;
		this.totalInstallments = totalInstallments;
		this.paidInstallments = paidInstallments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Float getExpenseValue() {
		return ExpenseValue;
	}

	public void setExpenseValue(Float ExpenseValue) {
		this.ExpenseValue = ExpenseValue;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
		Expense other = (Expense) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", totalInstallments=" + totalInstallments + ", paidInstallments="
				+ paidInstallments + ", ExpenseValue=" + ExpenseValue + ", expenseDate=" + expenseDate + "]";
	}
}
