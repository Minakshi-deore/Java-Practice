package com.oop;

public class Circle extends Shape {

	@Override
	public void area() {
		double area = 2*Math.PI*radius*radius;
		System.out.println("Circle Area is :"+area);
	}
	

}
