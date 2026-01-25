package com.oop;

import java.util.Scanner;

public class Shape_Main {
	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		c.radius=sc.nextDouble();
		c.area();
	}

}
