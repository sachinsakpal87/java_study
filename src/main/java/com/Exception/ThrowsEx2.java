package com.Exception;

import java.io.IOException;

/*
VIMP Note:-throws should always throw checked Exception/ Unchecked Exception are dev mistake one should fix it
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
