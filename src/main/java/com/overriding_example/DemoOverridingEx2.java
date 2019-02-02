package com.overriding_example;

class Parent2 {
	void fun() {
		System.out.println("fun of Parent class is called");
	}
}

class child2 extends Parent2 {
	void fun() {
		System.out.println("fun of Child class is called");
	}
}

public class DemoOverridingEx2 {

	public static void main(String[] args) {
		child2 obj = new child2();
		obj.fun();
	}
}

//OP
//fun of CHild class is called
