package com.Interface;

public class Online implements Payment{
	
	public void bill(double amount) {
		if(offer_amount<=amount) {
			System.out.println("Apply discount");
		double discount_amount = amount*discount/100;
		double total_bill= amount - discount_amount;
		System.out.println("Total Bill:"+total_bill);
		}else {
			System.out.println("Not Apply discount");
		
			
		}
	}

}
