package com.static_demo;

public class DemoStaticEx2 {
	static int counter;

	DemoStaticEx2() {
		counter++;
		System.out.println("Object is created " + counter);
	}

	public static void main(String[] args) {
		DemoStaticEx2 objDemoStaticEx2 = new DemoStaticEx2();
		DemoStaticEx2 obj2DemoStaticEx2 = new DemoStaticEx2();
		DemoStaticEx2 obj3DemoStaticEx2 = new DemoStaticEx2();
	}
}
