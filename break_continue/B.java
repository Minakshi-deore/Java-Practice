package com.break_continue;

public class B {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				break;
			}
			System.out.println(i);

			i++;
		} while (i <= 100);

	}
}
