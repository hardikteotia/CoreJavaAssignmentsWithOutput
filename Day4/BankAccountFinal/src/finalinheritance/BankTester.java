package finalinheritance;

import java.util.Scanner;


public class BankTester {

	public static void main(String[] args) {
		boolean exit=false;
		BankAccount[] ref = new BankAccount[5];
		int index = 0;
		int totalAccount = 0;
		Scanner sc = new Scanner(System.in);
		do {
		
		System.out.println("Enter your choice\n1. Open Saving Account"
				+ "\n2. Open Current Account"
				+ "\n3. Check Account Details"
				+ "\n4. Withdraw Money"
				+ "\n5. Deposit Money"
				+ "\n6. Exit Program");
		
		switch(sc.nextInt()) {
		case 1: 
			ref[index] = new SavingAccount(10, "Hardy", "98080", 0.0);
			totalAccount++;
			index++;
			break;
		case 2:
			ref[index] = new CurrentAccount(11, "Bard", "45654", 0.0);
			totalAccount++;
			index++;
			break;
		case 3:
			for (BankAccount it : ref) {
			    if (it != null) {
			        System.out.println(it.toString());
			    }
			}
			break;
			
		case 4:
			
			break;
		case 5:
			ref[index].depositMoney(10_000);
			break;
		case 6:
			exit=true;
			System.out.println("exiting...");
			break;
		}
	}while(!exit);
	
	}

}
