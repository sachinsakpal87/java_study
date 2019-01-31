package com.homework;

public class DemoFinalKeyword {
	public static void main(String[] args) {
		final Test t = new Test();
		t.i = 20;
		System.out.println("" + t.i);
	}

	private static class Test {
		int i;

		Test() {
			i = 10;
		}

		Test(int i) {
			this.i = i;
		}
	}
}
