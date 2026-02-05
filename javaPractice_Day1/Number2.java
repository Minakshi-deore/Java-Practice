package com.javaPractice_Day1;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num >=100) {
			System.out.println("Greater than hundread");
		}else {
			System.out.println("Smallest than hundread");
		}
	}

}
