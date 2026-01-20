package com.array_code;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int[]num= {90,89,67,43,24,67,89};
		int[]num1={38,48,55,60,67,77,88};
		int[]num2={38,48,55,60,67,77,88};
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 90));
		System.out.println(num.length);
		System.out.println(Arrays.compare(num2, num1));
	}

}
