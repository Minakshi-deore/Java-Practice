package com.constructor;

public class Account {
	double balance;
	
	Account(){
		balance=1000;
		
	}
	Account(int balance){
		this.balance=balance;
	}
	void accountInfo() {
	System.out.println("Balance"+balance);

}
}