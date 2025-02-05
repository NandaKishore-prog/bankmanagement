package com.pack.console;

import java.util.Scanner;

import com.pack.AccountManagement.UserAccount;

public interface ValidatorCustomer  extends MenuBoxOfUser{
	default void OldOrNewCustomer(Scanner scanner) {

		int checkno = -1;
		System.out.print("new Customer -1/old Customer-2");
		checkno = scanner.nextInt();
		if (checkno == 1) {
			System.out.print(
					"how much you going to deposit for opening account:");
			inputchecker(scanner);
			int amount = scanner.nextInt();
			scanner.nextLine();
			UserAccount account = new UserAccount(amount);
			account.DetailsForm(scanner);
			account.registerACCnum(account);
			System.out.print(account.getAccnum());

		} else if (checkno == 2) {
			System.out.println("how can i help you");
			System.out.println("how can i help you");
			System.out.println("1.balance check");
			System.out.println("2.withdraw");
			System.out.println("3.Send Money");
			System.out.println("4.deposit");
			MenuOfUser(scanner);

		}

	}

	default void inputchecker(Scanner scanner) {
		if (!scanner.hasNextInt()) {
			System.out.println("Invalid input. Please enter a valid amount.");
			scanner.next();
			return;
		}

	}}
