package com.homework;

class Test {
	public static int a = 9;

	static void tempMethod() {
		System.out.println("Static method called");
		a = 7;
	}

	void tempMethod2() {
		Test.tempMethod();
	}
}

public class DemoStatic {

	public static void main(String args[]) {

		Test t = new Test();
		t.tempMethod2();
		System.out.println(Test.a);
	}
}
