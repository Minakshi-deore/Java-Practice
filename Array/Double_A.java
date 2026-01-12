package com.Array;

import java.util.Scanner;

public class Double_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double [] num = new double[4];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextDouble();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
