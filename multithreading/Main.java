package com.multithreading;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.m1();
	}

}
