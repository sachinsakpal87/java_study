package com.exception;

import java.io.IOException;

/*
VIMP Note:-throws should always throw checked exception/ Unchecked exception are dev mistake one should fix it
*/
public class ThrowsEx2 {
	public static void main(String[] args) throws IOException {
		ThrowsEx2 obj = new ThrowsEx2();
		obj.n();
	}

	void fun() throws IOException {
		throw new IOException("IOException occurred");
	}

	void n() throws IOException {
		fun();
	}
}
