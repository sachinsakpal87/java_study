package com.overloading_example;

//overloading type promotion ambiguity
public class DemoOverloadingEx4 {

	public static void main(String[] args) {

		DemoOverloadingEx4 objDemoOverloadingEx4 = new DemoOverloadingEx4();
		//objDemoOverloadingEx4.sum(1, 2);

	}

	public void sum(int a, long b) {
		System.out.println(a + b);
	}

	public void sum(long a, int b) {
		System.out.println(a + b);
	}
}
