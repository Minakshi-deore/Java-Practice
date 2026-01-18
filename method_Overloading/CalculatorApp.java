package com.method_Overloading;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("a+b="+c.add(2,2));
		System.out.println("a+b="+c.add(6,6,6));
	    c.multiply(4.8, 6.9);
		System.out.println("a*b="+c.multiply(2, 3));
		c.area(2, 3.14);
		c.area(4, 5);
		c.display(9);
		c.display("Hello Minakshi");
		c.sum(9.9, 8.9);
		System.out.println("a+b="+c.sum(8, 8.4));
		
	}
	
}
