package com.pojo;



public class Patient {
	int id;
	String name;
	int age;

	Patient() {

	}

	public Patient(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

	public void patientDetail() {
		
		if (age <= 12) {
			System.out.println("Child Specialist");
		} else if (age >= 60) {
			System.out.println("Senior Citizen Priority");
		} else {
			System.out.println("Regular");

		}
	}

	@Override
	public String toString() {
		
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
