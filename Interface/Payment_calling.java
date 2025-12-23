package com.Interface;

public class Payment_calling {
	public static void main(String[] args) {
		Payment p;
		p = new Online();
		p.bill(6000);
		p = new Cash();
		p.bill(6000);
	}
}
