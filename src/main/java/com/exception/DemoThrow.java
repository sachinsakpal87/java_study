package com.exception;

public class DemoThrow {
	public static void main(String args[]) {
		DemoThrow obj = new DemoThrow();
		obj.validate(13);
		System.out.println("rest of the code...");
	}

	void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("not valid");
		} else {
			System.out.println("welcome to vote");
		}
	}
}
