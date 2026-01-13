package com.switchCase_Code;

import java.util.Scanner;

public class Rate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category (Domestic,Commercial,Industrial)");
		String category=sc.next();
		switch(category) {
		case "Domestic":
			System.out.println(" Domestic electricity rate is 5 unit ");
			break;
		case "Commercial":
			System.out.println("Commercial electricity rate is 10 unit");
			break;
		case "Industrial":
			System.out.println("Industrial electricity rate is 100 unit");
			break;
		default:
			System.out.println("Invalid Category");
				
		}
	}

}
