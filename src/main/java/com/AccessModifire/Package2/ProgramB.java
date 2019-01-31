package com.AccessModifire.Package2;

import com.AccessModifire.Package1.ClassTemplate;

public class ProgramB {

	public static void main(String[] args) {
		ClassTemplate newObj = new ClassTemplate();
		ChildClass newOb = new ChildClass();
		System.out.println(newObj.print());

		//Default variable is not accessible outside the package
		/**System.out.println("Default is Visible"+newObj.default_int);*/

		//Protected variable is accessible outside the package in child class only
		/**System.out.println("Protected is Visible"+newObj.protected_int);*/

		//Private variable is not accessible outside the class
		/**System.out.println("Public is Visible"+newObj.private_int);*/

		System.out.println("Public is Visible" + newObj.public_int);

		//System.out.println(newOb.);

	}
}
