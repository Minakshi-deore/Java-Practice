package com.array_practice;

import java.util.Scanner;

public class Odd_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		int [] num = new int[4];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println("Odd number is:"+num[i]);
			}
		}
	}

}
