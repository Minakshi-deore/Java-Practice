package com.abstractClass;

public class Phonepe extends Payament {
	
	Phonepe(){
		super(3000);
		
	}
	 void cashBack() {
		 if(transaction>=1000) {
			 System.out.println("200 Cashback in phonepe");
		 }else {
			 System.out.println("no cashback");
		 }
	 }

}
