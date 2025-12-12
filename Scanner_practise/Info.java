package com.Scanner_practise;

import java.util.Scanner;

public class Info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}

}
