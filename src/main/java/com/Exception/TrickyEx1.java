package com.exception;

public class TrickyEx1 {
	public static void main(String[] args) {
		try {
			badMethod();
		} catch (Exception ae) {
			System.out.println("Catch called ");
		} finally {
			System.out.println("Finally called ");
		}
		System.out.println("normal run called ");
	}

	private static void badMethod() {
		throw new Error();
	}
}
