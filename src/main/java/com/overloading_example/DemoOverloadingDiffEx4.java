package com.overloading_example;

//exception has no restriction in overloading

public class DemoOverloadingDiffEx4 {

	public static void main(String[] args) {
		DemoOverloadingDiffEx4 obj = new DemoOverloadingDiffEx4();
//		obj.fun(null);
	}

	void fun(int a) throws Exception {
		System.out.println("public is called");
	}

	void fun() {
		System.out.println("private is called");
	}

	void fun(float a) {
		System.out.println("protected is called");
	}

	void fun(double a) {
		System.out.println("default is called");
	}


	void fun(Integer a) throws Exception {
		System.out.println("public is called");
	}
	void fun(Object a) throws Exception {
		System.out.println("public is called");
	}
}
