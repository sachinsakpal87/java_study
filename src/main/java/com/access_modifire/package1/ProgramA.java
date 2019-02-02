package com.access_modifire.package1;

public class ProgramA {

	public static void main(String[] args) {
		ClassTemplate newObj = new ClassTemplate();
		System.out.println(newObj.print());

//		PrintStream ob = null;
//		ob.println("Sachin");

		System.out.println("Default is Visible :- " + newObj.default_int);

		System.out.println("Protected is Visible :- " + newObj.protected_int);

		System.out.println("Public is Visible :- " + newObj.public_int);

		// Private variable is not accessible outside the class
		/** System.out.println("Public is Visible"+newObj.private_int); */

		// Default class is accessible only inside package
		DefaultClass obj = new DefaultClass();
		obj.print();
	}
}
