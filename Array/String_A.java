package com.Array;

import java.util.Scanner;

public class String_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String [] name = new String[4];
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}

}
