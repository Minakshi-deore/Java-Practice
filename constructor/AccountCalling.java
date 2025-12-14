package com.constructor;

public class AccountCalling {
	public static void main(String[] args) {
		Account a = new Account();
		a.accountInfo();
		Account a1 = new Account(2000);
		a1.accountInfo();
	}

}
