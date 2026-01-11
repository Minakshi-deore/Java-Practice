package com.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee(123,"Minakshi","Pune");
		FileOutputStream file = new FileOutputStream("C:\\java Code\\employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(e);
		oos.close();
		file.close();
		System.out.println("File is created...");
	}

}
