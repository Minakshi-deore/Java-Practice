package com.condition_state;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		double temp = sc.nextDouble();
		if(temp >=30) {
			System.out.println("Hot Day");
		}else {
			System.out.println("Not Hot Day");
		}
	}

}
