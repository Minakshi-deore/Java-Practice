package com.array_code;

public class Sum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 2 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}

		System.out.println(sum);

	}
}