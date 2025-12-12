package com.Scanner_practise;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Triangle three side");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int perimeter=a+b+c;
		System.out.println("perimeter of triangel is:"+perimeter);
	}

}
