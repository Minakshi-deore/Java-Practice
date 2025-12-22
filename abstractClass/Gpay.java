package com.abstractClass;

public class Gpay extends Payament {
	
	Gpay(){
		super(2000);
	}
	void cashBack() {
		if(transaction >=1000  ) {
			System.out.println("100 cashBack");
		}else {
			System.out.println("No Cashback");
		}
		
	}

}
