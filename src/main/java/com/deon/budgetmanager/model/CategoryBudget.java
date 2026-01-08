package com.deon.budgetmanager.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CategoryBudget implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Float budgetValue;
	
	@ManyToOne
	@JoinColumn(name = "budget_id")
	private Budget budget;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	public CategoryBudget() {}
	
	public CategoryBudget(Integer id, String name, Float budgetValue, Budget budget, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.budgetValue = budgetValue;
		this.budget = budget;
		this.category = category;
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
	
	public Float getBudgetValue() {
		return budgetValue;
	}
	
	public void setBudgetValue(Float budgetValue) {
		this.budgetValue = budgetValue;
	}
	
	public Budget getBudget() {
		return budget;
	}
	
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
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
		CategoryBudget other = (CategoryBudget) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "CategoryBudget [id=" + id + ", name=" + name + ", budgetValue=" + budgetValue + "]";
	}
}
