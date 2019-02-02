package com.instanceofex;

abstract class Animal3 {
	abstract void bark();
}

class Dog3 extends Animal3 {

	@Override
	void bark() {
		System.out.println("Barking");
	}
}

public class DemoInstanceOfEx6 {

	public static void main(String[] args) {
		Animal3 a = new Dog3();
		System.out.println(a instanceof Dog3);
		System.out.println(a instanceof Animal3);
	}
}
