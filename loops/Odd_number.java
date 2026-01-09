package com.loops;

import java.util.Scanner;

public class Odd_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Point");
		int s = sc.nextInt();
		System.out.println("Enter Ending point");
		int e = sc.nextInt();
		int i = s;
		do {
			if(i%2!=0) {
			System.out.println(i);
			}
		i++;
			
		}while(i<=e);
	}

}
