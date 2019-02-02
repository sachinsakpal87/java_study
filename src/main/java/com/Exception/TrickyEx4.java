package com.exception;

public class TrickyEx4 {
	static void method() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("Finally method called ");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			method();
		} catch (Exception ae) {
			System.out.println("Catch called !!!!");
		} finally {
			System.out.println("Main Finally called ");
		}
		System.out.println("Program continued ... ");
	}
}
