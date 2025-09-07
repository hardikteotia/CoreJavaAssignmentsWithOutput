package finalinheritance;

public class CurrentAccount extends BankAccount{

	private double overdraftLimit = 10_000;
	public CurrentAccount(long accountNumber, String customerName, String phoneNumber, double balance) {
		super(accountNumber, customerName, phoneNumber, balance);
		
	}

	@Override
	public boolean withdraw(double amount) {
	    /*if (getBalance() - amount < 2000) { // Let's say 2000 is your minimum allowed balance
	        System.out.println("Balance less than Minimum Balance");
	        return false;
	    }*/
	    if(getBalance() - amount > 2000) {
	        setBalance(getBalance() - amount);
	        System.out.println("Withdrawl Successful!!");
	        return true;
	    }
	    else {
	    	if(getBalance()+overdraftLimit>amount) {
	    		setBalance(0);
	    		overdraftLimit-=amount;
	    		return true;
	    	}
	    	else {
	    		System.out.println("Declined!!");
	    		return false;
	    	}
	    }
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
