package com.Interface;

public interface Payment {
	public static final double offer_amount=5000;
	public static final double discount=50;
	
	public abstract void bill(double amount);

}
