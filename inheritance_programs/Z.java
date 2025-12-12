package com.inheritance_programs;

public class Z extends Y{
	int z = 400;
	
	void display() {
		System.out.println("x value:"+x);
		System.out.println("y value :"+y);
		System.out.println("z value :"+z);
	}
	public static void main(String[] args) {
		Z z = new Z();
		z.display();
	}

}
