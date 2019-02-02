package com.string_demo;

public final class DemoImmutableClass {
	final String pancardNumber;

	DemoImmutableClass(final String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public static void main(String[] args) {
		DemoImmutableClass demoImmutableClass = new DemoImmutableClass("BASKJJHASKJHC");
		System.out.println(demoImmutableClass.getPancardNumber());
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
