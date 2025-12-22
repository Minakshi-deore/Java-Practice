package com.abstractClass;

public abstract class A {
	
	public abstract void m1();
	
	
    A(){
    	System.out.println("abstract class constructor");
    }
	
	public void m2() {
		System.out.println("non abstract method of A class");
	}

}
