package com.multithreading;

public class Demo extends War implements Runnable {

	@Override
	public void run() {
		System.out.println("This is run method of Runnable Interface");
		
	}
	public void display() {
		System.out.println("This is display method of Demo class");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.show();
		
		Thread t = new Thread(d);
		t.start();
	}

}
