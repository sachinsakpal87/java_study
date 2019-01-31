package com.Static;

public class DemoStatic {

	static {
		System.out.println("Static called");
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("main called");
	}
}
