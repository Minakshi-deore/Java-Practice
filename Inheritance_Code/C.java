package com.Inheritance_Code;

public class C extends A{
	void m3() {
		System.out.println("method 3");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m3();
		B b = new B();
		b.m1();
		b.m2();
	}

}
