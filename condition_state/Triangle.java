package com.condition_state;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of triangle");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		if(s1 == s2 && s2 == s3) {
			System.out.println("Equilaterial triangle");
		}else if(s1 == s2 || s2 == s3 || s1 == s3 ) {
			System.out.println("Isosceles triangle");
		}else {
			System.out.println("Scalene Triangle");
		}
	}

}
