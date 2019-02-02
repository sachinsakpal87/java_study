package com.intervierw.questions;

/*
 * used to work in java 6 but from java7 onward this functionality is removed
 */
public class DemoRunJavaWoMain {
	static {
		System.out.println("static_example block is called");
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("Main is called");
	}
}
