package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 *
 * Parent will have Parent exception and child will have Child or no exception :P :D
 * Applicable only for checked exception
 */

class Parent4 {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class TestExceptionChild4 extends Parent4 {
	void msg() throws FileNotFoundException {
		System.out.println("child");
	}

	void abc() throws  FileNotFoundException {

	}
}

public class ExceptionOverridingEx4 {
	public static void main(String[] args) {
		Parent4 p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}



