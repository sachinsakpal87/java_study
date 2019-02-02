package java.overriding;

import java.io.FileNotFoundException;

//if child class is throwing any checked exception then parent class should throw same or its parent checked 
//exception

class Parent9 {
	void fun() throws Exception {
		System.out.println("Parent class fun is called");
	}

	void fun2() throws FileNotFoundException {
		System.out.println("Parent class fun2 is called");
	}

	void fun3() {
		System.out.println("Parent class fun3 is called");
	}

	void fun4() {
		System.out.println("Parent class fun4 is called");
	}
}

class Child9 extends Parent9 {
	void fun() {
		System.out.println("Child class fun is called");
	}

	void fun2() throws FileNotFoundException {
		System.out.println("Child class fun2 is called");
	}

	void fun3() throws Error {
		System.out.println("Child class fun3 is called");
	}

	void fun4() throws ArrayIndexOutOfBoundsException {
		System.out.println("Child class fun3 is called");
	}
}

public class DemoOverridingDiffEx4 {

	public static void main(String[] args) {
		Parent8 obj = new Parent8();
		Parent8 obj2 = new Child8();
		Child8 obj3 = new Child8();

		obj.fun();
		obj2.fun();
		obj3.fun();
		obj.fun2();
		obj2.fun2();
		obj3.fun2();
//		obj.fun3();
//		obj2.fun3();
//		obj3.fun3();

	}
}
