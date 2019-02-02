package com.exception;

class Test1 {
	void n() {
		int n = 2;
		while (n > 0) {
			--n;
			throw new Error();
		}
	}

	void m() throws ArithmeticException {
		try {
			n();
		} catch (Error e) {
			throw new ArithmeticException();
		} finally {
			try {
				throw new Error();
			} catch (Exception e) {
				System.out.println("Ek aur exception");
			}
		}
	}
}

public class TrickyEx6 {
	public static void main(String[] args) throws Exception {
		Test1 test = new Test1();
		try {
			test.m();
		} catch (Error e) {
			System.out.println("Error occurred");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception occurred");
		} finally {
			System.out.println("Finally Executed ");
		}
	}
}
