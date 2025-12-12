package com.inheritance_programs;

public class Dog extends Animal  {
	void bark() {
		System.out.println("voice of dog is bark");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
	
	

}
