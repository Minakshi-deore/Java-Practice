package com.oop;

public class SavingAccount extends BankAccount{
	 
	public void interestRate() {
		if (amount >= 5000) {
			System.out.println("interest rate is 6%");
		}else {
			System.out.println("Not Apply Interest");
		}
	}
	

}
