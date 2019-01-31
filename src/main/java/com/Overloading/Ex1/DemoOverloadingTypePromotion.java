package com.Overloading.Ex1;

public class DemoOverloadingTypePromotion {

	public static void main(String[] args) {
		DemoOverloadingTypePromotion obj = new DemoOverloadingTypePromotion();
		byte b = 10;
		obj.function(b, b);
		obj.function(0, 0);
	}

	void function(byte b1, byte b2) {
		System.out.println("byte value is " + b1 + " " + b2);
	}

	void function(short b1, short b2) {
		System.out.println("short value is " + b1 + " " + b2);
	}

	void function(int b1, int b2) {
		System.out.println("int value is " + b1 + " " + b2);
	}

	void function(Integer b1, Integer b2) {
		System.out.println("Integer value is " + b1 + " " + b2);
	}
}
