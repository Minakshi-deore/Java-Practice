package com.constructor;

public class Rectangle {
	double length;
	double width;
	
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	void printArea() {
		double area=length*width;
		System.out.println("Area :"+area);
	}

}
