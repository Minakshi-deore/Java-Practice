package com.Scanner_practise;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double radius = sc.nextDouble();
		//double area =Math.PI*radius*radius;
		double area = 3.14*radius*radius;
		System.out.println("Area of circle:"+area);
	}

}
