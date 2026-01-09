package com.loops;

import java.util.Scanner;

public class Even_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting point");
		int s = sc.nextInt();
		System.out.println("Enter Ending point");
		int e = sc.nextInt();
		for (int i=s;i<=e;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
