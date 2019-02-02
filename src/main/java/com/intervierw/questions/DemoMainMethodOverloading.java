package com.intervierw.questions;

public class DemoMainMethodOverloading {

	public static void main(String str1, String str2) {
		System.out.println("Overloaded main method is called " + str1 + " " + str2);
	}

	public static void main(String... strings) {
		System.out.println("Vargas main method is called");
	}

	public static void main(String str, String... strings) {
		System.out.println("Vargas main method is called");
	}

	//
//    	public static void main(string_demo [] args){
//		System.out.println("Original main method is called");
//	}
	public static void main(int var) {
		System.out.println("Overloaded main is called");
	}
}
