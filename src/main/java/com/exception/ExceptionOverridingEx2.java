package com.exception;

/**
 * Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
 */
class P {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild1 extends P {
	//Unchecked exception propagates to main thread if not caught.
	//no need to throw Arithmetic exception explicitly as it gets propogates automatically
	//Unchecked Exceptions is a developer mistake hence we should stricktly avoid adding uncheck exception in throws in method declaration.
	void msg() {
		throw new ArithmeticException();
	}
}

public class ExceptionOverridingEx2 {
	public static void main(String[] args) {
		P p = new TestExceptionChild1();
		p.msg();
	}
}


