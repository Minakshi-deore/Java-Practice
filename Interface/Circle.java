package com.Interface;

public class Circle implements Shape {
          public void area() {
        	  double pi=3.14;
        	  double r = 2;
        	  double area = 2*pi*r*r;
        	  System.out.println("Area:"+area);
		
        	 
	}
          public static void main(String[] args) {
			 Shape s;
			 s = new Circle();
			 s.area();
		}

}
