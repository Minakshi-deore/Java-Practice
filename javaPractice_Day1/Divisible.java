package com.javaPractice_Day1;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("divisible by 5");
		}else {
			System.out.println("Not divisible by 5");
		}
	}

}
