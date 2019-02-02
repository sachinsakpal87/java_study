package com.string_demo;

public class DemoStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");//now original string is changed
		System.out.println(sb1);//prints HJavaello
		System.out.println(sb.reverse()); //dlroW olleH

		System.out.println(sb.delete(1, 3)); //doW olleH

		System.out.println(sb.equals(sb2)); //false
		System.out.println(sb == sb2); //false
		System.out.println(sb.toString().equals(sb2.toString())); //true
	}
}

// StringBuffer is Thread safe (All methods are Synchronized)
// StringBuilder is same as StringBuffer except synchronized methods
