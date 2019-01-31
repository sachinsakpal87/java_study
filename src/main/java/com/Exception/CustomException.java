package com.Exception;

class AgeNotValidException extends Exception {
	AgeNotValidException(String message) {
		super(message);
	}
}

public class CustomException {
	public static void main(String[] args) {
		int i = 13;
		if (i < 18) {
			try {
				throw new AgeNotValidException("Age should be more than 18 current Age is " + i);
			} catch (AgeNotValidException e) {
				System.out.println("Exception occurred" + e);
			}
		}
	}
}
