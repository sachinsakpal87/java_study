package com.Arrays;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 3 };
		int b[] = a;
		int[] c = new int[] { 4, 1, 2, 3 };
		// Print array using inbuilt function
		System.out.println("" + Arrays.toString(a));
		//Sort array using inbuilt function
		Arrays.sort(a);
		Arrays.sort(c);
		System.out.println("" + Arrays.toString(a));
		System.out.println("" + Arrays.toString(b));
		System.out.println("" + Arrays.toString(c));
		//Copy array a into d
		int[] d = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			d[i] = a[i];
		}
		int[] e = Arrays.copyOf(a, a.length);
		System.out.println("" + Arrays.toString(e));

		// check if arrays are equal or not
		if (a == b) {
			System.out.println("Both a & b are same");
		} else {
			System.out.println("Both a & b are diff");
		}
		if (a == c) {
			System.out.println("Both a & c are same");
		} else {
			System.out.println("Both a & c are diff");
		}
		if (Arrays.equals(a, b)) {
			System.out.println("Values of a & c are same");
		}
	}
}
