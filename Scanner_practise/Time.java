package com.Scanner_practise;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter seconds");
		int seconds=sc.nextInt();
		int m=seconds/60;
		int s=seconds%60;
		System.out.println("Minutes"+m);
		System.out.println("seconds"+s);
	}

}
