package com.Scanner_practise;

import java.util.Scanner;

public class Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		String ch = sc.next();
		switch (ch) {
		case "a","A","e","E","i","I","o","O","u","U":
			System.out.println(" a is Vowel");
		break;
				default:
			System.out.println("Consonant");
			
		
		
		
		
		}

	}
}
