package com.intervierw.questions;

class classA {
	static String test = "This is test string";

	classA() {
		String str = new String("sachin");
		System.out.println("Constructor of class A is called");
	}
}

class classB {
	classB() {
		System.out.println("Constructor of class B is called");
	}
}

public class DemoClassConstructorEx1 {

	static String test = "";

	DemoClassConstructorEx1() {
		String str = new String("sachin");
		String stat_string = "";
		System.out.println("Constructor of DemoClassConstructorEx1 is called");
	}

	public static void main(String[] args) {
		int stat_string = 3;

		/*
		 * Unless and until object of class is created
		 * class constructor is not called
		 * */
	}
}
