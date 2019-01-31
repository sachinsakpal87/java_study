package com.String;

public class DemoStringsImmutable {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("String :: " + str.hashCode());
		str = str + " World";
		System.out.println("String :: " + str.hashCode());

		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println("String Builder" + stringBuilder.hashCode());
		stringBuilder.append(" World");
		System.out.println("String Builder" + stringBuilder.hashCode());
	}
}
