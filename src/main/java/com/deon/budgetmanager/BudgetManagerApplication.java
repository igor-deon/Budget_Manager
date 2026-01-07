package com.deon.budgetmanager;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deon.budgetmanager.model.Account;
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
		
		
		u1.getAccounts().addAll(List.of(ac1, ac2));
		
		System.out.println(u1);
		System.out.println(ac1);
		System.out.println(ac2);
	}
}
