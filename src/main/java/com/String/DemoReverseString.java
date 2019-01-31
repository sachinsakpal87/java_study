package com.String;

public class DemoReverseString {
	public static void main(String[] args) {
		//Using String builder
		String str = "Reverse this String";
		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb.reverse());

		//Using traverser
		char[] strArray = str.toCharArray();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += (strArray[i]);
		}
		System.out.println(rev);

		//Just sequence reverse
		String[] strings = str.split(" ");
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.print(strings[i] + " ");
		}
		System.out.println();
		//sequence and String both reverse
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
