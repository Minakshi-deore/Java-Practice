package com.practice_problem;

public class BookCalling {
	public static void main(String[] args) {
		Book b = new Book(909,"wings of fire","APJ ");
		b.issueBook();
	    b.returnBook();
		StudentUser s = new StudentUser ("Cs");
		s.showDetails();

}
}