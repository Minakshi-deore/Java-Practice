package com.switchCase_Code;

import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color");
		String color = sc.next();
		switch(color) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Color");
		}
	}

}
