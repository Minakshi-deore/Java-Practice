package com.multithreading;

public class JoinMethod extends Thread {
	    public void run() {
	        for (int i = 1; i <= 100; i++) {
	            System.out.println("Child thread: " + i);
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        JoinMethod t = new JoinMethod();
	        t.start();
	        t.join();   // main thread waits
	        System.out.println("Main thread ends");
	    }
	}


