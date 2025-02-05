package com.pack.AccountManagement;

import java.util.Scanner;

abstract class details {

	private String name;
	private long phoneno;
	private int age;
	private String gender;
	private String address;
	private String password;

	public void setPassword(String password) {
		this.password = password;
	}

	public void DetailsForm(Scanner scanner) {
	
		System.out.println("enter the below details");
		System.out.print("Name :");
		this.name = scanner.nextLine();
		System.out.print("phoneno :");
		this.phoneno = scanner.nextLong();
		System.out.print("age :");
		this.age = scanner.nextInt();
		System.out.print("gender (M/F):");
		scanner.nextLine();
		this.gender = scanner.nextLine();
		System.out.print("address :");
		this.address = scanner.nextLine();
		System.out.print("Set Password:");
		setPassword(scanner.nextLine());
		
	}

	public String getName() {
		return name;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

}
