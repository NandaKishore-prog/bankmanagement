package com.pack.console;

import java.util.ArrayList;
import java.util.Scanner;
import javax.security.auth.login.AccountException;

import com.pack.AccountManagement.UserAccount;

public interface operations {

	default void ChangePassWord(Scanner scanner) {
		
		
		
		System.out.println("Enter the Account number");
		int Accnum = scanner.nextInt();
		System.out.println("Enter the Phone number");
		long phoneno = scanner.nextLong();
		scanner.nextLine();
	    UserAccount account=new UserAccount();
	   ArrayList<UserAccount> userAccounts= account.getAccoutnregnew();
	    for(int i=0;i<userAccounts.size();i++) {
	    	if(userAccounts.get(i).getAccnum()==Accnum&&userAccounts.get(i).getPhoneno()==phoneno) {
	    		System.out.println("Change the password:");
	    		userAccounts.get(i).setPassword(scanner.nextLine());
	    	
	    	}
	    	
	    	
    }
	    
		
		
		
	}
	
}
