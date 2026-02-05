package com.javaPractice_Day1;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		String ch= sc.next();
		if(ch.equals("A")|| ch.equals("E")|| ch.equals("I")|| ch.equals("O")||ch.equals("U")
				||ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}

}
