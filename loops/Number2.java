package com.loops;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Point");
		int s = sc.nextInt();
		System.out.println("Enter Ending Pont");
		int e = sc.nextInt();
		int i = s;
		do {
			System.out.println(i);
			i++;
		}while(i<=e);
		
	}

}

		
