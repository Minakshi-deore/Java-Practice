package com.Inheritance_Code;

public class D1 extends C1 {
	void mD() {
		System.out.println("Method of D");
	}
	public static void main(String[] args) {
		D1 d = new D1();
		d.mA();
		d.mC();
		d.mD();
		System.out.println("***************");
		B1 b = new B1();
		b.mA();
		b.mB();
	}

}
