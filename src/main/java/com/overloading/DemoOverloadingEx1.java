package com.overloading;

//overloading by changing the arguments

public class DemoOverloadingEx1 {

	public static void main(String[] args) {

		DemoOverloadingEx1 objDemoOverloadingEx1 = new DemoOverloadingEx1();
		objDemoOverloadingEx1.sum(1, 2);
		objDemoOverloadingEx1.sum(1, 2, 6);
	}

	void sum(int a, int b) {
		System.out.println((a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
