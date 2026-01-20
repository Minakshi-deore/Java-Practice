package com.array_code;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter students name");
		String[] stdname = new String[5];
		for(int i=0;i<stdname.length;i++) {
		   stdname[i]=sc.next();
		}
		   System.out.println("Enter Student name you want search");
		   String name=sc.next();
		
		boolean found = false;
		for(int i=0;i<stdname.length;i++) {
			if(stdname[i].equals(name)) {
			found=true;
			break;
			
		}
		}
		if(found) {
			System.out.println("Student is Exit");
		}else {
			System.out.println("Student Not Exit");
		}
		
	}

}
