package com.overriding_example;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
}

class BabyDog extends Dog {

}

public class DemoOverridingEx6 {

	public static void main(String[] args) {
		Animal obj = new BabyDog();
		obj.eat();
		BabyDog obj2 = new BabyDog();
		obj2.eat();
	}
}
