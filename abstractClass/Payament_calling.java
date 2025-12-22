package com.abstractClass;

public class Payament_calling {
	
	public static void main(String[] args) {
		Payament p;
		p = new Gpay();
		p.cashBack();
		p = new Phonepe();
		p.cashBack();
	}

}
