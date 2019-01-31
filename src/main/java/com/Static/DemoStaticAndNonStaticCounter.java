package com.Static;

class Counter {
	static int staticCounter = 0;
	int nonStaticCounter = 0;

	Counter() {
		nonStaticCounter++;
		staticCounter++;
		System.out.println("static := " + staticCounter + " and nonstatic := " + nonStaticCounter);
	}
}

public class DemoStaticAndNonStaticCounter {
	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
	}
}
