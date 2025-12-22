package com.abstractClass;

public class Admin extends Login {

	@Override
	void myAuthenticate(String username, String password) {

		if (username == "Ram@gmail.com" && password == "Ram@123") {
			System.out.println("User Login Successfully ");
		} else {
			System.out.println("Invalid Credentials ... ! ");
		}

	}

}
