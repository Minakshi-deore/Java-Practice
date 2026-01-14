package com.array_practice;

public class Count_Array {
	public static void main(String[] args) {
		int[]num= {2,4,6,8,9,8,7,6,7};
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("Even Numbers count:"+evencount);
		System.out.println("Odd Number count:"+oddcount);
	}

}
