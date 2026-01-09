package com.loops;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int s = sc.nextInt();
		System.out.println("Enter Ending number");
		int e = sc.nextInt();
		for(int i=s; i<=e;i++) {
			System.out.println(i);
		}
	}

}
