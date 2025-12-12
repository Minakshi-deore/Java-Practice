package com.Scanner_practise;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int square=num*num;
		int cube=num*num*num;
		System.out.println("Square of a number:"+square);
		System.out.println("Cube of a number:"+cube);
	}

}
