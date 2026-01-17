package com.exception_handling;

public class MyExp1 {
	public void m1()  {
		int a = 2;
		int b= 0;
		if(b==0){
			throw new MyException("This is not allowed");
		}
		int result= a/b;
		System.out.println(result);
	}
}

		
	


