package com.superkeyword;

class Parent1 {

	Parent1() {
	}

	Parent1(String a) {

	}

	Parent1(String a, String b) {

	}

	void fun() {

	}
}

class Child1 extends Parent1 {

	Child1() {
	}

	Child1(String a) {

	}

	Child1(String a, String b) {
		this(a);
	}

//    Super can only be used in constructor
//    void fun(){
//        super();
//    }
}

public class DemoSuper1 {
	public static void main(String... args) {

		Child1 obj = new Child1("a", "b");
	}
}
