package com.pack.AccountManagement;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserAccount extends details {
	private static ArrayList<UserAccount> accoutnregnew = new ArrayList<>();
	private int amount;
	private long accnum;
	private static long reg = 11334400;
	private role role;

	public UserAccount(int amount) {
		this.amount = amount;
		this.accnum = reg;
		this.role=role.customer;
		reg++;
	}
	public UserAccount() {
	
	}
	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", getName()=" + getName()
				+ ", getPhoneno()=" + getPhoneno() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + "]";
	}

	public ArrayList<UserAccount> getAccoutnregnew() {
	
		return accoutnregnew;
	}

	public void registerACCnum(UserAccount accoutnregnew) {
		this.accoutnregnew.add(accoutnregnew);
	}

	public long getAccnum() {
		return accnum;
	}

}
