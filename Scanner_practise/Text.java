package com.Scanner_practise;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name");
		String name = sc.nextLine();
        System.out.println("Enter Address:");
		String Address = sc.nextLine();
		System.out.println("name :" + name);
		System.out.println("Address :" + Address);
	}

}
