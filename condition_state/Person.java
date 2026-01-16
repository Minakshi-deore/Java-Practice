package com.condition_state;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if ( age >=18) {
			System.out.println("Person can vote");
			
		}else {
			System.out.println("Person cannot vote");
		}
	}

}
