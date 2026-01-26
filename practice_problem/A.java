package com.practice_problem;

public class A {
	
	public A(){
		System.out.println("Parent class non parameterize Constructor");
		
	}
	public A(int a) {
		this();
		System.out.println("Parent class parameterize constructor");
	}

}
