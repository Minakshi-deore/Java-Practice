package com.method_Overloading;

public class Demo {
	void show(int a,String s) {
		System.out.println(a);
		System.out.println(s);
	}
	void show(String s,int a) {
		System.out.println(s);
		System.out.println(a);
		
	}
	void add (double d,float b,double c) {
		System.out.println(d+b+c);
	}
	
	void add(double k,float l,int m) {
		System.out.println(k+l+m);
	}
	void add(int a,float b) {
		System.out.println(a+b);
	}
	void add(float c,int d) {
		System.out.println(c+d);
	}
	void add(double e,float f) {
		System.out.println(e+f);
	}

}
