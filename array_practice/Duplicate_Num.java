package com.array_practice;

public class Duplicate_Num {
	public static void main(String[] args) {
		int[]num= {9,8,88,99,6,9,5,8};
		
		for(int i = 0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
					break;
				}
			}
		}
	}

}
