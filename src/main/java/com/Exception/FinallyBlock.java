package com.exception;

public class FinallyBlock {
	public static void main(String args[]) {

		try {
			int data = 25 / 5;
			System.out.println("\nCode executed Properly :: " + data);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred");
		} finally {
			System.out.println("First finally block is always executed\n");
		}

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred because of divide by zero 25 / 0");
		} finally {
			System.out.println("Middle finally block is always executed\n");
		}

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println("\nNull Pointer exception occurred");
		} finally {
			System.out.println("Last Finally Block Executed :: Neither code nor exception handled but finally executed\n");
		}
	}
}
