package com.array_practice;

public class Copy_Array {
	public static void main(String[] args) {
		String [] fruits1 = {"Mango","Apple","Banana","Grapes","Orange"};
		String [] fruits2 = new String[fruits1.length];
		System.out.println("Array 2 Elements");
		for(int i =0;i<fruits1.length;i++) {
			fruits2[i]=fruits1[i];
			System.out.println(fruits2[i]);
		}
	}

}
