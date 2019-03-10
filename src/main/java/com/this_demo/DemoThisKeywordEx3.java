package com.this_demo;

class Test {

	Test getInstance() {
		return this;
	}

	void msg() {
		System.out.println("Hello Java ... !!!!");
	}
}

public class DemoThisKeywordEx3 {

	public static void main(String[] args) {
		new Test().getInstance().msg();
	}
}
