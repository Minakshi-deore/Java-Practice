package com.array_code;

public class Average {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 7, 6, 5, 4, 33, 22 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double average = sum / arr.length;

		System.out.println(average);
	}

}
