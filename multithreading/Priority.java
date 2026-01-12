package com.multithreading;

public class Priority extends Thread {
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println("Print "+i);
		}
		System.out.println("Priority:"+getPriority());
	}
	
	public void m1() {
		for(int i=111;i<=200;i++) {
			System.out.println("M1"+" "+i);
		}
		
	}
	
	public static void main(String[] args) {
		Priority p = new Priority();
		p.setPriority(10);
		p.start();
		p.m1();
		
	}

}
