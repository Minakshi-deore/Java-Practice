package com.abstractClass;

public abstract class Payament {
	int transaction;
	
	Payament(int transaction){
		this.transaction=transaction;
	}
	
	abstract void cashBack();
	
	void checkbalance() {
		System.out.println("Check balance");
	}

}
