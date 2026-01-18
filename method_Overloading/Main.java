package com.method_Overloading;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main method");

		Main.main(1);
		Main.main(1, "Hello");

	}

	public static void main(int a) {
		System.out.println("overloaded main method");

	}

	public static void main(int a, String b) {
		System.out.println("overloaded method");

	}

}
