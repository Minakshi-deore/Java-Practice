package com.practice_problem;

import java.util.Scanner;

public class CalculatorCalling {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		Scanner  sc =  new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter three number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("Enter two numbers");
		double s = sc.nextDouble();
		double t = sc.nextDouble();
		System.out.println("Addition of:"+a+"+"+b + "=" +  c.add(a,b));
		System.out.println("Addition of:"+x+"+"+y+"+"+z + "=" + c.add(x, y, z));
		System.out.println("Addition of:"+s+"+"+t + "=" +c.add(s, t));
		
	}

}
