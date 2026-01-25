package com.oop;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		s.amount=sc.nextDouble();
		s.deposit();
		s.withdraw();
		s.interestRate();
	}

}
