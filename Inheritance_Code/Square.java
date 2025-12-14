package com.Inheritance_Code;

public class Square extends Shape {
	String type="Square";
	
	public static void main(String[] args) {
		Square s= new Square();
		System.out.println(s.type);
		System.out.println("Shape type :"+s.type);
		Circle c=new Circle();
		System.out.println(c.type);
		System.out.println("Shape type :"+c.type);
	}

}
