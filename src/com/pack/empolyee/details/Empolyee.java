package com.pack.empolyee.details;

import java.util.ArrayList;
import java.util.Scanner;

import com.pack.AccountManagement.role;
import com.pack.console.validatorAdmin;

public class Empolyee implements validatorAdmin {
	
	private static ArrayList<Empolyee> empolyee = new ArrayList<>();
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}


	private role role;
	
	public Empolyee(Scanner scanner) {
		System.out.print("Enter the UserName():");
		this.userName=scanner.nextLine();
		System.out.print("Enter the password**:");
		this.password=scanner.nextLine();	
	}
	
	public ArrayList<Empolyee> GetRegEmpolyee() {
	return empolyee;
	}

	public  void setRegEmpolyee(Empolyee empolyee) {
		this.empolyee.add(empolyee);
		this.role=role.Admin;
	}

	public static ArrayList<Empolyee> getEmpolyee() {
		return empolyee;
	}
	

}
