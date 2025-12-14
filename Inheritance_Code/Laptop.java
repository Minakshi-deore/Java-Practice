package com.Inheritance_Code;

public class Laptop extends Device {
	
	Laptop(){
	super("DEll","I5","Laptop","IDTOP9090",50000);
		
	}
	void laptopInfo() {
		System.out.println("Laptop is best for coders");
	}
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.deviceDetails();
		l.laptopInfo();
		System.out.println("***********");
		Mobile m = new Mobile();
		m.deviceDetails();
		m.mobileInfo();

	}
	
	

}
