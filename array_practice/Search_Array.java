package com.array_practice;

public class Search_Array {
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 5, 4, 2 };
		int num = 10;
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				found = true;
				break;

			}

		}
		if (found) {
			System.out.println("Exist");
		} else {
			System.out.println("Not exit");
		}
	}

}
