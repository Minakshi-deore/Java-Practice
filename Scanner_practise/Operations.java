package com.Scanner_practise;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		int n1=num1*num2;
		double n2=num1/num2;
		System.out.println("Multiplication :"+n1);
		System.out.println("Division:"+n2);
	}

}
