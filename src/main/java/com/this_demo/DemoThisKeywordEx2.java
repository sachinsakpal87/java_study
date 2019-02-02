package com.thisdemo;

class A {
	B obj;

	A(B obj) {
		this.obj = obj;
		System.out.println("Value of a is " + obj.a);
	}
}

class B {
	int a;
	A obj;

	B() {
		a = 40;
		A obj = new A(this);
	}
}

public class DemoThisKeywordEx2 {

	public static void main(String[] args) {
		B obj = new B();
	}
}
