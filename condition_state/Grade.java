package com.condition_state;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		double m = sc.nextDouble();
		if(m >=90 && m <= 100) {
			System.out.println("Grade A");
		}else if(m >= 75 && m <=89) {
			System.out.println("Grade B");
		}else if(m >= 50 && m <= 74) {
			System.out.println("Grade C");
		}else if(m >= 35 && m <= 49) {
			System.out.println("Grade D");
		}else if(m < 35) {
			System.out.println( "Fail");
		}else {
			System.out.println("Invalid Marks");
		}
	}
	

}
