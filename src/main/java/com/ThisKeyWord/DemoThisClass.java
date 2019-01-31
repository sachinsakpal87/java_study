package com.ThisKeyWord;

class ClassA {
	static int x, y;
	final int p, q;
	int a, b, c;

	ClassA() {
		System.out.println("Default constructor called");
		this.a = 5;
		this.p = 10;
		this.q = 20;
		this.x = 100;
		this.y = 100;
	}

	ClassA(int b) {
		//System.out.println("First Statement"); //not allowed
		this();        // this should be first statement
		System.out.println("Single Parameter Constructor called");
		this.b = b;
	}

	ClassA(int b, int c) {
//        this(); //this will throw compile time error for below statement as this should be first statement hence two this is not allowed
		this(b);
		System.out.println("Double Parameter Constructor called");
		this.c = c;
	}

	void function() {
//		this(); //This can be called only inside Constructor
	}

	void function1() {
		this.function(); // Can used to call function
	}

	void thisArgs() {
		foo(this); //this as a variable
	}

	void foo(ClassA classA) {
		classA.print();
	}

	void print() {
		System.out.println("Value of a= " + a + " b= " + b + " c= " + c);
	}
}

public class DemoThisClass {
	static int x, y; //this can't be used inside static block

	//	final int p,q;
	public static void main(String... args) {
		ClassA obj = new ClassA(10, 15);
		obj.print();
		obj.thisArgs();
	}
}
