package com.pack.console;

import java.util.Scanner;

import com.pack.AccountManagement.UserAccount;

public interface MenuBoxOfUser extends operations{

	default void MenuOfUser (Scanner scanner) {
		System.out.println("Enter the option");
		System.out.println("1.change password:");
		System.out.println("2.change adress:");
		System.out.println("3.change the phoneno:");
		System.out.println("4.close the account:");
		int option=scanner.nextInt();
		switch(option) {
		case 1:
			ChangePassWord(scanner);
			break;

		}
		
		
		

		
	}
	
	
}
