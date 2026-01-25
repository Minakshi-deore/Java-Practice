package com.oop;

public class BankAccount {
	double amount;
	
	public void deposit() {
		if( amount >=500) {
			System.out.println("Deposite :"+amount);
		}else {
			System.out.println("Not valid amount for deposite");
		}
		
	}
	 public void withdraw() {
		 if(amount>=500 && amount <=10000) {
			 System.out.println("Withdraw balance :"+amount);
		 }else {
			 System.out.println("Not valid balance for withdraw");
		 }
	 }

}
