package com.interview_question;

class A {
	int a;

	A() {

	}

	A(int i) {
		fun(i);
		Afun(i);
	}

	int fun(int i) {
		return i + 5;
	}

	private void Afun(int i) {

	}
}

class B extends A {
	int b;

	B() {

	}

	B(int i) {
		super(i);
		fun(i);
	}

	int fun(int i) {
		return i + 5;
	}

	private void Bfun(int i) {

	}
}

class C extends B {
	int c;

	C() {

	}

	C(int i) {
		super(i);
		fun(i);
	}

	int fun(int i) {
//		System.exit(0);
		String str = String.format("Integer Value : %08d", 1234);
		String str1 = String.format("Integer Value : %18s", "1234");
		System.out.println(str);
		System.out.println(str1);
		return i + 5;
	}

	private void Cfun(int i) {

	}
}

public class DemoFunCallSeq {
	public static void main(String args[]) {
		A obj = new C(10);
		obj.fun(11);
	}
}
