package com.thisdemo;

//this keyword can be use to call constructor
//this should be use at as a first statement

public class DemoThisKeywordEx1 {

	DemoThisKeywordEx1() {
		System.out.println("Default Constructor");
	}

	DemoThisKeywordEx1(int a) {
		this();
		System.out.println("parameterised Constructor with parameter " + a);
	}

	DemoThisKeywordEx1(int a, int b) {
		this(a);
		System.out.println("parameterised Constructor with parameter " + a + " and " + b);
	}

	public static void main(String[] args) {
		DemoThisKeywordEx1 objDemoThisKeywordEx1 = new DemoThisKeywordEx1(1, 2);
		objDemoThisKeywordEx1.method(6, 9);
	}

	void method(int b) {

		System.out.println("Value of b " + b);
	}

	void method(int a, int b) {
		System.out.println("value of a " + a);
		this.method(b);
	}
}
