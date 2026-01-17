package com.exception_handling;

public class ExceptionDemo {
	public void m1() {

		System.out.println(4 / 2);
		System.out.println(8 / 4);
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			System.out.println("Divided by zero not alowed");
		}
		System.out.println(9 / 3);

		System.out.println(4 / 5);
	}

	public void m2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
