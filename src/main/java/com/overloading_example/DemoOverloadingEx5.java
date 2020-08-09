package com.overloading_example;

//overloading is supported in java
public class DemoOverloadingEx5 {

//	public static void main(String [] args) {
//
//	}

	public static void main(String s) {
		System.out.println("Just one string arg");
	}

	public static void main() {
		System.out.println("withour args");
	}

	public static void main(String... strings) {
		System.out.println("var args");
	}
}
