package com.exception;

public class CheckedExceptionPropagation {
	public static void main(String args[]) {
		CheckedExceptionPropagation obj = new CheckedExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}

	//Below method will throw compile time error as checked exception are not propagated
	void m() {
//        throw new IOException("device error");//checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}
}
