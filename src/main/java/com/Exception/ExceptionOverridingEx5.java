package com.Exception;

import java.io.IOException;

/**
 * Example in case subclass overridden method declares no exception
 */

class Parent5 {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class TestExceptionChild5 extends Parent5 {
	void msg() {
		System.out.println("child");
	}
}

public class ExceptionOverridingEx5 {
	public static void main(String[] args) {
		Parent5 p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}



