package com.overriding;

/**
 * Here fun() and fun1() is not overriding as signature is different
 */
class Parent4 {

	void fun(int var) {
		System.out.println("fun of Parent class fun is called");
	}

	void fun1(Object var) {
		System.out.println("fun of Parent class fun1 is called");
	}
}

class child4 extends Parent4 {
	void fun(String var) {
		System.out.println("fun of Child class fun is called");
	}

	void fun1(String var) {
		System.out.println("fun of Child class fun1 is called");
	}
}

public class DemoOverridingEx4 {

	public static void main(String[] args) {
		Parent4 obj = new child4();
		String str = null;
		obj.fun1("");
		obj.fun(5);
	}
}
