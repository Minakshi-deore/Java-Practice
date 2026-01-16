package com.condition_state;

import java.util.Scanner;

public class Temperature1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature");
		double temp = sc.nextDouble();
		if( temp >= 35) {
			System.out.println("Hot");
		}else if(temp <= 35 && temp >=10) {
			System.out.println("Cool");
		}else {
			System.out.println("Cold");
		}
	}

}
