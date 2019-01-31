package com.homework;

/**
 * In Java, values from -128 to 127 are cached, so the same objects are returned. The implementation of valueOf() uses cached objects if the value is between -128 to 127.
 * <p>
 * If we explicitly create Integer objects using new operator, we get the output as �Not Same�. See the following Java program. In the following program, valueOf() is not used.
 * <p>
 * // file name: Main.java
 */

public class SurprisingAutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer x = 400, y = 400;
		if (x == y) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		Integer a = 40, b = 40;
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		Integer m = Integer.valueOf(40);
		Integer n = Integer.valueOf(40);

		if (m == n) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		int k = 40, l = 40;
		if (k == l) {
			System.out.println("Same 123");
		} else {
			System.out.println("Not Same");
		}

		String str = "sachin";
		String str1 = "sachin";
		String str3 = str1;
		String str4 = new String("sachin");
		if (str3 == str4) {
			System.out.println("Same 123");
		} else {
			System.out.println("Not Same");
		}
	}
}
