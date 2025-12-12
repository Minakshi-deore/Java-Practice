package com.inheritance_programs;

public class Child1 extends Parent1 {
	int c=3;
	
	void printC() {
		System.out.println("print value of c:"+c);
	}
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.printA();
		c.printB();
		c.printC();
	}

}
