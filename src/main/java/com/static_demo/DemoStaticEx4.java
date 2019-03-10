package com.static_demo;

public class DemoStaticEx4 {

	static int b = 50;
	int a = 40;

	public static void main(String[] args) {
		//Below syntax will throw compile time error
		//System.out.println("value of a"+a);
		System.out.println("value of b" + b);
	}
}
