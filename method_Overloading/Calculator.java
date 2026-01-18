package com.method_Overloading;

public class Calculator {
	 float add(int a,int b) {
	    float c = a+b;
	     return c;

		 
	 }
	int add(int a,int b,int f) {
		int d = a+b+f;
		return d;
		 
	 }
	
	void multiply(double a,double b) {
		double c = a*b;
		System.out.println("a*b="+c);
	}
	
	double multiply(int a,int b) {
		double c = a*b;
		return c;
	}
	void area(double r,double pi) {
		double area = 2*pi*r*r;
		System.out.println("area of a circle:"+area);
		
	}
	void area(float l,float w) {
		double area = l*w;
		System.out.println("Area of rectangle:"+area);
		
	}void display(int a) {
		System.out.println("Integer value:"+a);
		
	}
	void display(String s) {
		System.out.println("String value:"+s);
	}
	
	void sum(float a ,float b) {
		float c = a+b;
		System.out.println("a+b+"+c);
		
	}
	double sum(double a,double b) {
		double c = a+b;
		return c;
		
	}
	


}
