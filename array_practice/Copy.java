package com.array_practice;

import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		int[] num1 = new int[4];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.nextInt();
		}
		   System.out.println("Array 1 Elements");

		for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
		}
		    System.out.println("Array 2 Element ");
		int[] num2 = new int[num1.length];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num1[i];
			System.out.println(num2[i]);

		}

	}
}
