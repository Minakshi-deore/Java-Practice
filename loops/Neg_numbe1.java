package com.loops;

import java.util.Scanner;

public class Neg_numbe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int num1 = sc.nextInt();
		System.out.println("Enter Ending number");
		int num2 = sc.nextInt();
		int i = num1;
		while(i>=num2) {
			System.out.println(i);
			i--;
		}
	}

}
