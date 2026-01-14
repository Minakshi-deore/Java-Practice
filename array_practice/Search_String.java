package com.array_practice;

import java.util.Scanner;

public class Search_String {
	public static void main(String[] args) {
		String[] list = { "minakshi", "Teju", "Suchita", "Nilima" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search ");
		String name = sc.next();
		
		boolean found=false;
		for(int i=0;i<list.length;i++) {
			if(list[i].equals(name)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Name Exit");
		}else {
			System.out.println("Name not Exit");
		}

	}

}
