package com.constructor;

public class Car {
	String modelName;
	int price;
	
	
	Car(){
		System.out.println("Car Started...");
	}
	Car(String modelName,int price){
		this.modelName=modelName;
		this.price=price;
		
	}
	void carInfo() {
		System.out.println("Car model name:"+modelName);
		System.out.println("Car price:"+price);
	}

}
