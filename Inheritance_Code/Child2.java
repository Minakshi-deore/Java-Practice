package com.Inheritance_Code;

public class Child2 extends Parent {
	void c() {
		System.out.println("Child class 2");
		
	}
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.p();
		c.c();
		Child2 c1 = new Child2();
		c1.p();
		c1.c();
		
	}

}
