package com.overriding_example;

class Parent3 {
	void fun() {
		System.out.println("fun of Parent class is called");
	}
}

class child3 extends Parent3 {
	void fun() {
		System.out.println("fun of Child class is called");
	}
}

public class DemoOverridingEx3 {

	public static void main(String[] args) {
		Parent3 obj = new child3();
		obj.fun();
	}
}

//fun of Child class is called
