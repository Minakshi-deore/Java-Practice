package com.Scanner_practise;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p=sc.nextDouble();
		System.out.println("Enter rate");
		double r=sc.nextDouble();
		System.out.println("Enter years or time");
		double n=sc.nextDouble();
		double SI=(p*r*n/100);
		System.out.println("Simple interest:"+SI);
	}

}
