package com.inheritance;

public class BankAccount {
	private int accountNumber;
	protected double Balance;
	private String customerName;
	private String phoneNumber;
	private double amount;
	
	public BankAccount(int accountNumer,double Balance,String customerName,String phoneNumber) {
		this.accountNumber=accountNumer;
		this.Balance=Balance;
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;	
	}
	public void Deposit(double amount) {
		this.amount= amount;
	}
	public void Withdraw(double amount) {
		if(this.amount<0) {
			System.out.println("Low Balance");
		}
		this.amount = this.amount - amount;
	}
	public String getAccountSummary()
	{
		return "Acc. No: "+this.accountNumber+" Balance: "+Balance+" Customer Name: "
				+ customerName+" Phone Number: "+phoneNumber;
	}
	
	public double getBalance() {
		return Balance;
	}


}
