package com.abstractClass;

public class Animal_Calling {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();
	}
	

}
