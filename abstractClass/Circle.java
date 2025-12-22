package com.abstractClass;

public class Circle extends Shape {
	double radius=4;

	public void area() {
		double area = 2 * 3.14 * radius * radius;
		System.out.println("Circle area:" + area);

	}

}
