package com.Scanner_practise;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name");
		String product = sc.next();
		System.out.println("Enter product quantity");
		int quantity=sc.nextInt();
		System.out.println("Enter product price");
		int price =sc.nextInt();
		int totalBill=(price*quantity);
		System.out.println("product name:"+product);
		System.out.println("product quantity:"+quantity);
		System.out.println("Product price:"+price);
		System.out.println("Total Bill:"+totalBill);
	}

}
