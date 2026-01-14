package com.array_practice;

import java.util.Scanner;

public class Reverse_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		int [] num = new int[4];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println("Reverse Array ");
		for(int i =num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
