package com.array_code;

import java.util.Arrays;
import java.util.Scanner;

public class Even_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays element");
		int[] num = new int[9];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
			System.out.println(Arrays.toString(num));
		
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				evencount++;
			} else {
				oddcount++;

			}
		}
		System.out.println("Even count is:"+evencount);
		System.out.println("Odd count is:"+oddcount);

	}

}
