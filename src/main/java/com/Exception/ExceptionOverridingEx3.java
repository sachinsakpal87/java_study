package com.exception;

import java.io.IOException;

/**
 * Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 */
class Parent2 {
	//Here below exception is mandatory else compiletime error will occur.
	void msg() throws ArithmeticException, Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends Parent2 {
	void msg() throws IOException {
		System.out.println("child");
		throw new IOException();
	}
}

public class ExceptionOverridingEx3 {
	public static void main(String[] args) {
		Parent2 p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception ae) {
			System.out.println("Handle kiya re");
		}
	}
}


