package com.Inheritance_Code;

public class Monitor extends Student1 {
        void moniInfo() {
        	System.out.println("Monitor is handle the classroom");
        }
        public static void main(String[] args) {
			Monitor m = new Monitor();
			m.collegeInfo();
			m.studInfo();
			m.moniInfo();
			System.out.println("************");
			Teacher1 t = new Teacher1();
			t.collegeInfo();
			t.teachInfo();
			
		}

}
