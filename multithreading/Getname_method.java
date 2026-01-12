package com.multithreading;

public class Getname_method extends Thread {
	public void run() {
		System.out.println("Thread Name:"+getName());
		
	}
	
	public static void main(String[] args) {
		Getname_method g = new Getname_method();
		g.setName("New Thread");
		g.start();
		
	}

}
