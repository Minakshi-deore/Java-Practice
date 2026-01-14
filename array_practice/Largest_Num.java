package com.array_practice;

import java.util.Scanner;

public class Largest_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int [] num = new int [5];
		
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
		}
		
		int max = num[0];
		for(int i =0;i<num.length;i++) {
		if(num[i]>max) {
			max=num[i];
			}
		}
		System.out.println("Maximum number is:"+max);
}
}