package com.overloading_example;

//Return type don't care in case of overloading

public class DemoOverloadingDiffEx1 {

	public static void main(String[] args) {
		DemoOverloadingDiffEx1 obj = new DemoOverloadingDiffEx1();
		obj.fun();
	}

	int fun(int a) {
		System.out.println("Int is called");
		return a;
	}

	void fun() {
		System.out.println("void is called");
	}
}
