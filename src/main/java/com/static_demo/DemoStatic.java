package com.static_demo;

public class DemoStatic {

	static {
		System.out.println("static_example called");
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("main called");
	}
}
