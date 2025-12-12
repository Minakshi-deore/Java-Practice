package com.inheritance_programs;

public class Child extends Parent {
	int y =20;
	
	void showValue_y() {
		System.out.println("y value is:"+y);
	}

	
	
	public static void main(String[] args) {
		Child c = new Child();
		c.showValue_x();
		c.showValue_y();
	
	
	}
}





