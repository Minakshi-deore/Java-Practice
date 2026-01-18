package com.method_Overloading;

public class Number {
	void calculator(int a) {
		int square = a*a;
		System.out.println("Square:"+square);
	}
	void calculator(float a) {
		float cube = a*a*a;
		System.out.println("Cube :"+cube);
	}

}
