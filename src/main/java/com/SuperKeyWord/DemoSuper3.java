package com.SuperKeyWord;

class A {
	public A(int i) {
	}
}

class B extends A {
	public B() {
		this(0);
	}

	public B(int i) {
		super(i);
	}
}

public class DemoSuper3 {
	public static void main(String... args) {

		B obj = new B();
		B obj2 = new B(2);
	}
}
