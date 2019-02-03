package com.string_demo;

public class DemoStringIntern {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";

		System.out.println("Hello");
		System.out.println("s1 == s2 "+(s1==s2));
		System.out.println("s1 == s2 "+(s1.intern()==s2));

		String s3 = new Integer(20).toString();
		String s4 = Integer.valueOf(20).toString();

		System.out.println("s3 == s4 "+(s3==s4));
		System.out.println("s3 == s4 "+(s3.intern()==s4.intern()));

	}
}
