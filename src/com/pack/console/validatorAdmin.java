package com.pack.console;

import java.util.ArrayList;
import java.util.Scanner;

import com.pack.empolyee.details.Empolyee;

public interface validatorAdmin extends MenuBoxOfUser {
	
default boolean ValidAdmin() {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the email@ ID:");
	String UserName=scanner.nextLine();
	System.out.print("Enter the Password:");
	String passWord=scanner.nextLine();
	
	ArrayList<Empolyee> empolyee=Empolyee.getEmpolyee();
	for(Empolyee i:empolyee) {
		System.out.println(i.getUserName());
		System.out.println(i.getPassword());

		if(i.getPassword().equals(passWord)&&i.getUserName().equals(UserName)) {
			System.out.print("Registred ADMIN");
			return true;
		}
	}

	return false;

}
}
