package com.super_keyword;

class Parent {
	/**
	 * If Parent class constructor is made private then child class constructor will throw compile time error for super
	 *
	 * @param a
	 */
//	private Parent(string_demo a){
//
//	}
	Parent(String a) {

	}
}

class Child extends Parent {

	/**
	 * If Parent must have default constructor or below constructor will throw error
	 *
	 * @param a
	 */
//	Child(){
//	}
//
	Child(String a) {
		super(a);
	}
}

public class DemoSuper {
	public static void main(String... args) {

	}
}
