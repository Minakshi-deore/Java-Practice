package com.javaPractice_Day1;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num +":"+ "Positive");
		 }else if (num<0) {
				System.out.println(num +":" + "Negative");
		}else {
				System.out.println("zero");
		}
	}

}
