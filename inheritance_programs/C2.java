package com.inheritance_programs;

public class C2 extends B2 {
	void showC() {
		System.out.println("Show method C");
		
	}
	
	public static void main(String[] args) {
		C2 c = new C2();
		c.showA();
		c.showB();
		c.showC();
	}

}
