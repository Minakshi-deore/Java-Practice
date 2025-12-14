package com.Inheritance_Code;


public class Cat extends Animal {
	void color() {
		System.out.println("Cat color is white");
		
	
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sleep();
		d.bark();
		Cat c = new Cat();
		c.sleep();
		c.color();
	}

}
