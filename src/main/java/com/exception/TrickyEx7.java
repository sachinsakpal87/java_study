package com.exception;

import java.io.IOException;

public class TrickyEx7 {

	public static void main(String[] args) {
		TrickyEx7 obj = new TrickyEx7();

		try {
			Integer i = obj.fun();
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Integer fun() throws IOException {
		try {
			System.out.println("something");
			return 5;
		} catch (Exception e) {

		} finally {
			throw new IOException();
		}
	}
}
