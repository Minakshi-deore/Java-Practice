package com.Scanner_practise;

import java.util.Scanner;

public class Concate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter surname");
		String surname=sc.nextLine();
		System.out.println(name+" "+surname);
	}

}
