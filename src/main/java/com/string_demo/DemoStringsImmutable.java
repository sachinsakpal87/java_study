package com.string_demo;

public class DemoStringsImmutable {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("string_demo :: " + str.hashCode());
		str = str + " World";
		System.out.println("string_demo :: " + str.hashCode());

		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println("string_demo Builder" + stringBuilder.hashCode());
		stringBuilder.append(" World");
		System.out.println("string_demo Builder" + stringBuilder.hashCode());
	}
}
