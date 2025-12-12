package com.inheritance_programs;

public class Dog1 extends Animal1 {
	void bark() {
		System.out.println("dog is barking");
	}
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.needs();
		d.walking();
		d.bark();
	}

}
