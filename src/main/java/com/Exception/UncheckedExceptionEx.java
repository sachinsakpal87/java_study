package com.Exception;

public class UncheckedExceptionEx {

	public static void main(String[] args) {
		//Arithmetic Exception
		try {
			int i = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}

		//Null Pointer Exception
		try {
			String nullString = null;
			nullString.length();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception occurred");
		}

		//Number Format Exception
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception occurred");
		}

		//Array Index out of bound
		try {
			int[] arr = new int[5];
			arr[50] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception occurred");
		}
	}
}
