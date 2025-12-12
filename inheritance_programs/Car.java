package com.inheritance_programs;

public class Car extends Vehicle {
	void drive() {
		System.out.println("Car driving is fun");
	}
	void wheels() {
		System.out.println("Car has 4 wheels");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.drive();
		c.wheels();
	}

}
