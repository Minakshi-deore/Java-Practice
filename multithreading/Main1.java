package com.multithreading;

public class Main1 {
	public static void main(String[] args) {
		MyThread_1 th = new MyThread_1();
		
		th.m1();
		th.m2();
		th.print();
		Thread t = new Thread(th);
		t.start();
		
	}

}
