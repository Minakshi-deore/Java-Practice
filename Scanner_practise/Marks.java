package com.Scanner_practise;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English marks");
		double m1 = sc.nextDouble();
		System.out.println("Enter C marks");
		double m2= sc.nextDouble();
		System.out.println("Enter Java marks");
		double m3 = sc.nextDouble();
		System.out.println("Enter python marks");
		double m4 = sc.nextDouble();
		System.out.println("Enter C++");
		double m5=sc.nextDouble();
		double total=m1+m2+m3+m4+m5;
	    double	totalMax=500;
		double percentage= (total/totalMax)*100;
		System.out.println("English marks:"+m1);
		System.out.println("C marks:"+m2);
		System.out.println("Java marks:"+m3);
		System.out.println("Python marks:"+m4);
		System.out.println("C++ marks:"+m5);
		System.out.println("Total marks is:"+total);
		System.out.println("percentage :"+percentage);
		
	}

}
