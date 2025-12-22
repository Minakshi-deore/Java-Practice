package com.abstractClass;

public class EmployeeCalling {
	public static void main(String[] args) {
		Employee e ;
		e = new Developer();
		e.calculateSalary();
		e = new Manager();
		e.calculateSalary();
	}

}
