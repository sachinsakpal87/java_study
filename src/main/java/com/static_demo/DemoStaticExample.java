package com.static_demo;

class A {
	static int anInt = 5;
	int getAnInt = 6;

	static void fun() {
		System.out.println("an int " + anInt);
//		System.out.println("get an int "+getAnInt);
//		fun(anInt);
	}

	void fun(int abc) {
		System.out.println("an int " + anInt); //allowed
		System.out.println("get an int " + getAnInt);
		fun(); //allowed
//		fun(anInt);
	}
}

public class DemoStaticExample {
	public static void main(String... args) {
		A obj = new A();
		obj.fun(10);
	}
}
