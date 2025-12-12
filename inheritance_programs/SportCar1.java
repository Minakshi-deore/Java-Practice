package com.inheritance_programs;

public class SportCar1 extends Car1{
	void accelerate() {
		System.out.println("Sports car is accelerating..");
	}
	public static void main(String[] args) {
		SportCar1  s = new SportCar1();
		s.seats();
		s.number();
		s.accelerate();
				}
 
}
