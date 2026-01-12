package com.multithreading;
//Achieves multithreading using Runnable interface
public class MyThread_1 implements Runnable,A,B {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Runnable class methods" + i);
			try {

				Thread.sleep(500);
			} catch (InterruptedException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void print() {
		 
		 for(int i = 11;i<=20;i++){
	
		System.out.println("Print method" + i);
	try {
	
		Thread.sleep(1000);
	}catch(
	InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
		 }
}

	@Override
	public void m2() {
		System.out.println("Method of Class B");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method of class A");
		// TODO Auto-generated method stub
		
	}
	
}
