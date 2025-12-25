package com.pojo;

import java.util.Scanner;

public class HospitalInfo {
	public static void main(String[] args) {
		Patient p = new Patient();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Id");
		p.setId(sc.nextInt());
		System.out.println("Enter Patient Name");
		p.setName(sc.next());
		System.out.println("Enter Patient age");
		p.setAge(sc.nextInt());
		p.patientDetail();
        Doctor d = new Doctor();
        System.out.println("Enter Doctor Id");
        d.setId(sc.nextInt());
        System.out.println("Enter Doctor Name");
        d.setName(sc.next());
        System.out.println("Enter Doctor Specialization");
        d.setSpecialization(sc.next());
		Room r = new Room();
		System.out.println("Enter Room No");
		r.setRoomNo(sc.nextInt());
		System.out.println("Enter Room Type");
		r.setRoomType(sc.next());
		Hospital h = new Hospital(p,d,r);
		System.out.println(h);
		p.patientDetail();
		
	}

}
