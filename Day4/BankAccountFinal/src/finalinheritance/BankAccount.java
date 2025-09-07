package finalinheritance;

public class BankAccount {
	private long AccountNumber;
	private String CustomerName;
	private String PhoneNumber;
	private double Balance;

	
	
	public BankAccount(long accountNumber,String customerName,
						String phoneNumber, double balance) {
		AccountNumber = accountNumber;
		CustomerName = customerName;
		PhoneNumber = phoneNumber;
		Balance = balance;
	}
	
	
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	//withdraw and method to check negative Balance
	public boolean withdraw(double amount) {
	    if (this.Balance - amount < 0) {
	        return false; // Withdrawal would result in negative balance
	    } else {
	        this.Balance -= amount;
	        return true;
	    }
	}


	public void depositMoney(double amount) {
		this.Balance+=amount;
	}
	@Override
	public String toString() {
		return "Acc. No: " + AccountNumber + "\nBalance: "+Balance+"\nCustomer Name: "+
				CustomerName+"\nPhone No: "+PhoneNumber;
	}
	
}
