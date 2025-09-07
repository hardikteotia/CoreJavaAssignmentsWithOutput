package finalinheritance;

public class SavingAccount extends BankAccount{

	private double interestRate = 0.05;

	public SavingAccount(long accountNumber, String customerName, String phoneNumber, double balance) {
		super(accountNumber, customerName, phoneNumber, balance);
		// TODO Auto-generated constructor stub
	}
	
	//method to withdraw with condition
	@Override
//	public boolean Withdraw(double amount) {
//		
//		if(super.withdraw(amount)) {
//			System.out.println("Balance less than Minimum Balance");
//			return false;
//		}
//		else {
//			setBalance(getBalance()-amount);
//			return true;
//		}
//	}
	 public boolean withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance()- amount);
            return true;
        }
        return false;
    }
	
	public void ApplyInterest() {
		setBalance(getBalance()*interestRate);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
