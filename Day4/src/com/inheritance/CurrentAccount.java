package com.inheritance;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit = 5000.00;
	public CurrentAccount(int accountNumber, double Balance, String customerName, String phoneNumber) {
		super(accountNumber, Balance, customerName, phoneNumber);
		System.out.println("In Current account's constructor");
		
	}
	
	public void useOverdraftFacility() {
		
	}
}
