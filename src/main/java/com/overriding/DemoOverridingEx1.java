package com.overriding;

class Parent1 {
	void fun() {
		System.out.println("fun of Parent class is called");
	}
}

class child1 extends Parent1 {
	void fun() {
		System.out.println("fun of Child class is called");
	}
}

public class DemoOverridingEx1 {

	public static void main(String[] args) {
		Parent1 obj = new Parent1();
		obj.fun();
	}
}

//OP
//fun of Parent class is called
