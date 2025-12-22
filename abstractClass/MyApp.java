package com.abstractClass;

public class MyApp {
	public static void main(String[] args) {
		Login l;
		l = new Admin();
		l.myAppName();
		l.myAuthenticate("Ram@gmail.com", "Ram@123");
		l = new User();
		l.myAppName();
		l.myAuthenticate("om@gmail.com", "om@123");
		
		
	}

}
