package com.Scanner_practise;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if (num>0) {
			System.out.println("number is Positive");
		}else if(num<0) {
			System.out.println("number is Negative");
		}else {
			System.out.println("zero");
			
		}
		
	}

}
