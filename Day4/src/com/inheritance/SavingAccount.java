package com.inheritance;

public class SavingAccount extends BankAccount{
//	super();
	
	private double interestRate = 0.05;
	public SavingAccount(int accountNumer,double Balance,String customerName,String phoneNumber){
		
		super( accountNumer, Balance, customerName, phoneNumber);
		//this.interestRate=interestRate;
		System.out.println("in SavingAccount's constructor");
		
		
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public double applyInterest() {
		return this.Balance += this.Balance*getInterestRate();
	}
}
