package com.Exception;

import java.io.IOException;
import java.text.ParseException;

class Test {
	void n() throws Exception {
		int n = 2;
		while (n > 0) {
			--n;
			throw new Exception();
		}
	}

	void m() throws IOException, ParseException {
		try {
			n();
		} catch (Exception e) {
			throw new IOException();
		} finally {
//            try {
			throw new ParseException("", 4);
//            } catch (Exception e) {
//                System.out.println("Ek aur exception");
//            }
		}
	}
}

public class TrickyEx5 {
	public static void main(String[] args) throws Exception {
		Test test = new Test();
		try {
			test.m();
		} catch (IOException e) {
			System.out.println("IOException occurred");
			throw new Exception();
		} catch (ParseException pe) {
			System.out.println("ParseException occurred");
		} catch (Exception e) {
			System.out.println("Exception occurred");
		} finally {
			System.out.println("Finally Executed ");
		}
	}
}
