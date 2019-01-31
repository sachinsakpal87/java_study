package com.Exception;

public class TrickyEx2 {
	public static void main(String[] args) throws Exception {
		badMethod();
	}

	private static void badMethod() throws Exception {
		badMethod1();
	}

	private static void badMethod1() throws Exception {
		throw badMethod2();
	}

	private static Exception badMethod2() {
		return new Exception();
	}
}
