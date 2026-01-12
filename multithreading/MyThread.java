package com.multithreading;
// Achieves multithreading using thread class
public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("My thread" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void m1() {
		for (int i = 11; i <= 20; i++) {
			System.out.println("m1 logic" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
