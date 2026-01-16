package com.condition_state;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if( num % 2 == 0) {
			System.out.println("Even number");
			if( num > 50) {
				System.out.println("greater than 50");
			}else {
				System.out.println("less than 50");
			}
		}else {
			System.out.println("Odd number");
		}
	}

}
