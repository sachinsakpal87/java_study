package com.homework;

//filename: Test2.java
class Test1 {
	Test1(int x) {
		System.out.println("Constructor called " + x);
	}
}

//This class contains an instance of Test1 
class TestDemo2 {
	Test1 t1 = new Test1(10);

	TestDemo2(int i) {
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		TestDemo2 t2 = new TestDemo2(5);
	}
}

//Constructor called 10
//Constructor called 5
