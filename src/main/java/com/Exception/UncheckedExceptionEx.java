package com.exception;

public class UncheckedExceptionEx {

	public static void main(String[] args) {
		//Arithmetic exception
		try {
			int i = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred");
		}

		//Null Pointer exception
		try {
			String nullString = null;
			nullString.length();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer exception occurred");
		}

		//Number Format exception
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println("Number Format exception occurred");
		}

		//Array Index out of bound
		try {
			int[] arr = new int[5];
			arr[50] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound exception occurred");
		}
	}
}
