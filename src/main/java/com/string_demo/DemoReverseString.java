package com.string_demo;

public class DemoReverseString {
	public static void main(String[] args) {
		//Using string_demo builder
		String str = "Reverse this string_demo";
		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb.reverse());

		//Using traverser
		char[] strArray = str.toCharArray();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += (strArray[i]);
		}
		System.out.println(rev);

		String  [] rev2  = str.split("");
		String res2 = "";
		for (int i=0; i< rev2.length-1; i++){
			res2 += rev2[rev2.length-1-i];
		}

		System.out.println("res2 is "+res2);
		//Just sequence reverse
		String[] strings = str.split(" ");
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.print(strings[i] + " ");
		}
		System.out.println();
		//sequence and string_demo both reverse
		String[] strings1 = str.split(" ");
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.print(new StringBuilder(strings[i]).reverse() + " ");
		}
		System.out.println();

		String palindrome = "aabaa";
		StringBuilder stringBuilder = new StringBuilder(palindrome);
		String reverse = stringBuilder.reverse().toString();
		System.out.println(reverse.equals(palindrome));
	}
}
