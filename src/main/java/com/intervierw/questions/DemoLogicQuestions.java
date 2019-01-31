package com.intervierw.questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fibonacci series using recurssion
 */
class DemoFibonacci {

	private static long getFibonacci(int var) {

		if (var < 2) {
			return var;
		} else {
			return getFibonacci(var - 1) + getFibonacci(var - 2);
		}
	}

	public void printFibonacci(int value) {
		System.out.println("Printing fibonacci serise using recurssion");
		String space = "";
		for (int i = 0; i < value; i++) {
			System.out.print(space + getFibonacci(i));
			space = " ";
		}
		System.out.println();
	}
}

class DemoFibonacciArr {
	private void getFibonacci(int var) {
		int[] arr = new int[var];
		arr[1] = 1;
		for (int i = 2; i < var; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(Arrays.toString(arr));
	}

	public void printFibonacci(int value) {
		System.out.println("Printing fibonacci serise without recurssion");
		getFibonacci(value);
		System.out.println();
	}
}

class DemoFibonacciWr {
	private void getFibonacci(int var) {
		int fibo1 = 0;
		int fibo2 = 1;

		if (var <= 1) {
			System.out.print("" + var);
		} else {
			System.out.print(fibo1 + " " + fibo2);
		}
		for (int i = 0; i < var - 2; i++) {
			int c = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = c;
			System.out.print(" " + c);
		}
	}

	public void printFibonacci(int value) {
		System.out.println("Printing fibonacci serise without recurssion");
		getFibonacci(value);
		System.out.println();
	}
}

class DemoPrimeNumber {

	private boolean checkPrimeNumber(int var) {
		int div = var / 2;
		for (int i = 2; i <= div; i++) {
			int mod = var % i;
			if (mod == 0) {
				return false;
			}
		}
		return true;
	}

	public void isPrimeNumber(int value) {
		boolean result = false;
		result = checkPrimeNumber(value);
		if (result) {
			System.out.println("Number " + value + " is a Prime number");
		} else {
			System.out.println("Number " + value + " is not a prime number");
		}
	}
}

class DemoPalindrome {
	private boolean checkIfNumberisPalindrome(int value) {
		//545
		int originalValue = value;
		int sum = 0;
		while (value > 0) {
			int mod = value % 10;
			sum = sum * 10 + mod;
			value = value / 10;
		}
		if (originalValue == sum) {
			return true;
		}
		return false;
	}

	public void isPalindrome(int var) {
		boolean result = checkIfNumberisPalindrome(var);
		if (result) {
			System.out.println("Number " + var + " is Palindrome");
		} else {
			System.out.println("Number " + var + " is not Palindrome");
		}
	}
}

class DemoFactorial {

	private int calFactorial(int value) {
		if (value < 1) {
			return 1;
		}
		return value * calFactorial(value - 1);
	}

	public void printFactorial(int var) {
		System.out.println("Factorial of " + var + " is " + calFactorial(var));
	}
}

class DemoCalcPower {

	private int calcFactorial(int value, int pow) {
		if (pow < 1) {
			return 1;
		}
		return value * calcFactorial(value, pow - 1);
	}

	public void printPower(int var, int pow) {
		System.out.println("Value of " + var + " to the power " + pow + " is " + calcFactorial(var, pow));
	}
}

/**
 * main class
 */
public class DemoLogicQuestions {

	public static void main(String[] args) {

		System.out.print("Enter a number :: ");
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		System.out.println();

		DemoFibonacciArr objDemoFibonacciArr = new DemoFibonacciArr();
		objDemoFibonacciArr.printFibonacci(input);
		//Fibonacci series using recurssion
		DemoFibonacci objDemoFibonacci = new DemoFibonacci();
		objDemoFibonacci.printFibonacci(input);

		//Fibonacci series without using recurssion
		DemoFibonacciWr objDemoFibonacciwr = new DemoFibonacciWr();
		objDemoFibonacciwr.printFibonacci(input);

		//Check if the number is prime number
		DemoPrimeNumber objDemoPrimeNumber = new DemoPrimeNumber();
		objDemoPrimeNumber.isPrimeNumber(input);

		DemoPalindrome objDemoPalindrome = new DemoPalindrome();
		objDemoPalindrome.isPalindrome(input);

		DemoFactorial objDemoFactorial = new DemoFactorial();
		objDemoFactorial.printFactorial(input);

		DemoCalcPower objDemoCalcPower = new DemoCalcPower();
		objDemoCalcPower.printPower(2, 42);
	}
}
