package com.condition_state;

import java.util.Scanner;

public class Person_age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person age");
		int age = sc.nextInt();
		if( age >=18) {
			System.out.println("Adult");
		}else {
			System.out.println("Child");
		}
	}
	

}
