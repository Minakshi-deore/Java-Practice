package com.condition_state;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num % 10 == 0) {
			System.out.println("Number is divisible by 10");
		}else {
			System.out.println("Not divisible by 10");
		}
	}

}
