package com.practice_problem;

public class Employee extends Person {
       double Salary;
       
    
       
    public Employee(double Salary) {
    	super("Minakshi",22);
    	this.Salary=Salary;
    	System.out.println("Salary:"+Salary);
    }
}
