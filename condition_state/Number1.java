package com.condition_state;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is greater number");
		}else if(num2>num1) {
			System.out.println("num2 is greater number");
		}else {
			System.out.println("Both numbers are equal");
		}
	}

}
