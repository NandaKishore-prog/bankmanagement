package com.pack.console;

import java.util.Scanner;

import com.pack.empolyee.details.Empolyee;

public class BankManagement implements ValidatorCustomer,validatorAdmin{

	public static void main(String[] args) {
     BankManagement bManagement=new BankManagement();
		int checker=-1;
		Scanner scanner=new Scanner(System.in);

		while(checker!=5) {
			System.out.print("Enter who you are(customer-1 /admin-2/register-admin 3):");
			bManagement.inputchecker(scanner);

			int option=scanner.nextInt();
			switch(option) {
			case 1:
				bManagement.OldOrNewCustomer(scanner);
				
				break;
			case 2:
				if(bManagement.ValidAdmin()) {
				bManagement.MenuOfUser(scanner);
				}
				break;
			case 3:
				scanner.nextLine();
				Empolyee emoEmpolyee=new Empolyee(scanner);
				emoEmpolyee.setRegEmpolyee(emoEmpolyee);
				break;
				
			
			}
		}
		scanner.close();
		
//		
//		Account acc1 = new Account(1000);
//		System.out.println(acc1.getAccnum());
////		Account acc2=new Account(1000);
////		System.out.println(acc2.getAccnum());
//
//		acc1.DetailsForm();
//		acc1.registerACCnum(acc1);
//		System.out.print(acc1.getAccoutnregnew());
//	}

}

	
}