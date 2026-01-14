package com.array_practice;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.println(sum);
	}

}
