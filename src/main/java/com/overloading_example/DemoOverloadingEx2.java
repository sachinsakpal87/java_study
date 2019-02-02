package com.overloading_example;

//overloading by changing the type
public class DemoOverloadingEx2 {

	public static void main(String[] args) {

		DemoOverloadingEx2 objDemoOverloadingEx2 = new DemoOverloadingEx2();
		objDemoOverloadingEx2.sum(1, 2);
		objDemoOverloadingEx2.sum(1.0, 9);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(double a, double b) {
		System.out.println(a + b);
	}
}
