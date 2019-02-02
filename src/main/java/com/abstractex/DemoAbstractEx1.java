package com.abstractex;

abstract class A {

	abstract void fun();

	void test() {
		System.out.println("This is test function");
	}
}

class B extends A {

	@Override
	void fun() {
		System.out.println("Abstract method is implemented");
	}
}

public class DemoAbstractEx1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.fun();
		obj.test();
	}
}
