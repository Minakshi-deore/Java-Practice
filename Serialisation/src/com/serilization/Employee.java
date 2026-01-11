package com.serilization;
import java.io.Serializable;

public class Employee implements Serializable {
	
	int empId;
	String empName;
	String city;
	
	public Employee(int empId,String empName,String city) {
		this.empId=empId;
		this.empName=empName;
		this.city=city;
	}
	

}
