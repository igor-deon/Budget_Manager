package com.deon.budgetmanager;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deon.budgetmanager.model.Account;
import com.deon.budgetmanager.model.Category;
import com.deon.budgetmanager.model.CreditCard;
import com.deon.budgetmanager.model.CreditExpense;
import com.deon.budgetmanager.model.DebitExpense;
import com.deon.budgetmanager.model.User;
import com.deon.budgetmanager.model.enums.AccountType;

@SpringBootApplication
public class BudgetManagerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BudgetManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User("Igor Deon", "igordeon70@gmail.com", "hashhashhash");
		
		Account ac1 = new Account("PicPay", AccountType.CURRENT_ACCOUNT, (float) 3021.53, u1);
		Account ac2 = new Account("Bradesco", AccountType.CURRENT_ACCOUNT, (float) 408.20, u1);
		
		CreditCard c1 = new CreditCard("PicPay Credito", (float) 7000, 25, 5, ac1);
		CreditCard c2 = new CreditCard("Bradesco Credito", (float) 20000, 28, 8, ac1);
		
		DebitExpense e1 = new DebitExpense((float) 23.50, LocalDate.parse("2025-03-10"), new Category("Mercado", null), ac1);
		DebitExpense e2 = new DebitExpense((float) 55.45, LocalDate.parse("2026-01-03"), new Category("Farmácia", null), ac1);
		CreditExpense e3 = new CreditExpense((float) 55.45, LocalDate.parse("2026-01-04"), new Category("Farmácia", null), 2, 0, c2);
		
		c1.getExpenses().addAll(List.of());
		c2.getExpenses().addAll(List.of(e3));
		
		ac1.getCreditCards().addAll(List.of(c1));
		ac2.getCreditCards().addAll(List.of(c2));
		
		ac1.getExpenses().addAll(List.of(e1, e2));
		ac2.getExpenses().addAll(List.of());
		
		u1.getAccounts().addAll(List.of(ac1, ac2));
		
		System.out.print(u1);
		System.out.print(ac1);
		System.out.print(ac2);
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(e1);
		System.out.print(e2);
		System.out.print(e3);
	}
}
