package com.String;

public class DemoString {
	public static void main(String[] args) {
		String string1 = 20 + 20 + "NewString" + 50 + 50;
		System.out.println(string1);

		String string = "Hello World !!!!";
		System.out.println(string.substring(6)); //inclusing start index
		System.out.println(string.substring(0, 7)); //exclusive end index

		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());

		string = " Hello World !!!!! ";
		System.out.println(string.trim());
		string = string.trim();

		System.out.println(string.startsWith("He")); //true
		System.out.println(string.startsWith("he")); //false
		System.out.println(string.endsWith("!")); //true

		System.out.println(string.charAt(7)); //o
		System.out.println(string.charAt(0)); //H
		System.out.println(string.charAt(3)); //l

		System.out.println(string.length());

		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s + 10); //1010

		String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s1.replace("Java", "Kava");//replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);
		//Kava is a programming language. Kava is a platform. Kava is an Island.
	}
}
