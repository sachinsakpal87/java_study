package com.string_demo;

public class DemoEqualsString {
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "hello";
		String str5 = "Mello";
		String str6 = "Hejlo";

		System.out.println("Is Equals? :: " + str1.equals(str2));  //true
		System.out.println("Is Equals? :: " + str1.equals(str3));  //true
		System.out.println(str1 == str2);  //true
		System.out.println(str1 == str3);  //false
		System.out.println("Is Equals? :: " + str1.equalsIgnoreCase(str4)); //true
		System.out.println(str1.compareTo(str2)); //0
		System.out.println(str1.compareTo(str4)); //-32
		System.out.println(str1.compareTo(str5)); //-5
		System.out.println(str1.compareTo(str6)); //2
	}
}
