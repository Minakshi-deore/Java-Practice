package com.javaPractice_Day1;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num % 2 ==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
