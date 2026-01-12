package com.Array;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int [] number = new int[5];
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
	}

}
