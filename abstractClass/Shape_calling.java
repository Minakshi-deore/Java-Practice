package com.abstractClass;

public class Shape_calling {
	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.area();
		s = new Rectangle();
		s.area();
	}

}
