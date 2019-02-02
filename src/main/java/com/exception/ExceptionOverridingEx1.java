package com.exception;

/**
 * 1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
 */
class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent {
	//    If child method throws checked exception then Parent method should throw same exception
	// or parent exception Output:Compile Time Error
	void msg() //throws IOException {
	{
		System.out.println("TestExceptionChild");
	}
}

public class ExceptionOverridingEx1 {
	public static void main(String[] args) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}


