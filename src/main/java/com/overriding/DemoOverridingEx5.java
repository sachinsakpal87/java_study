package com.overriding;

/*
 * Below function fun is overriding as return type is co -varient
 */
class Parent5 {
	Object fun() {
		System.out.println("fun of Parent class is called");
		return "";
	}
}

class Child5 extends Parent5 {
	String fun() {
		System.out.println("fun of Child class is called");
		return "";
	}
}

public class DemoOverridingEx5 {

	public static void main(String[] args) {
		Parent5 obj = new Child5();
		obj.fun();
	}
}
