package com.inheritance_programs;

public class B extends A{
	void showB() {
		System.out.println("Method B");
	}
	public static void main(String[] args) {
		B b = new B();
			b.showA();
			b.showB();
		
	}

}
