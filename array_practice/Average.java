package com.array_practice;

public class Average {
	public static void main(String[] args) {
		int[] num = { 34, 78, 90, 6, 78, 67 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		double average = sum / num.length;
		System.out.println(average);

	}
}
