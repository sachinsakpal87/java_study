package com.overloading_example.Ex1;

public class DemoOverloading1 {

	public static void main(String[] args) {
		DemoOverloading1 obj = new DemoOverloading1();
		obj.fun(0);
		obj.fun(new String());
		obj.fun(Integer.valueOf(0));
//        	obj.fun(null);
		obj.fun(new Object());
	}

	void fun(String obj) {
		System.out.println("string_demo called");
	}

	void fun(Object obj) {
		System.out.println("Object called");
	}

	void fun(Integer obj) {
		System.out.println("Integer called");
	}

	void fun(int obj) {
		System.out.println("int called");
	}
}
