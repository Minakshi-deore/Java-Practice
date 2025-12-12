package com.inheritance_programs;

public class B1 extends A1 {
	int b =a*2;
	
	void printValue_b() {
		System.out.println("Value of b:"+b);
	}
	public static void main(String[] args) {
		B1 b = new B1();
		b.printValue_a();
		b.printValue_b();
	}

}
