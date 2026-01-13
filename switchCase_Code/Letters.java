package com.switchCase_Code;

public class Letters {
	public static void main(String[] args) {
		char ch  = 'e';
		switch(ch) {
		case 'a','e','i','o','u','A','E','I','O','U':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonant");
		}
	}

}
