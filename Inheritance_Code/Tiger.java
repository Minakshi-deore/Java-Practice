package com.Inheritance_Code;

public class Tiger extends Cat1{
	void roar() {
		System.out.println("Tiger is roaring");
	}
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.meow();
		t.roar();
	System.out.println("************");
	Dog1 d = new Dog1();
	d.eat();
	d.bark();
	
	
	}
	

}
