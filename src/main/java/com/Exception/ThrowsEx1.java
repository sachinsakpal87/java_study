package com.exception;

import java.io.IOException;

/*
VIMP Note:-throws should always throw checked exception/ Unchecked exception are dev mistake one should fix it
*/
public class ThrowsEx1 {
	public static void main(String[] args) {
		ThrowsEx1 obj = new ThrowsEx1();
		obj.n();
	}

	void fun() throws IOException {
		throw new IOException("IOException occurred");
	}

	void m() throws IOException {
		fun();
	}

	void n() {
		try {
			m();
		} catch (IOException e) {
			System.out.println("Checked exception Propogate via throws Keyword");
		}
	}
}
