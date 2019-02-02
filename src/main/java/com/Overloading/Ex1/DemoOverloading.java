package com.overloading.Ex1;

/**
 * For overloading Method name should be same and Argument must be different.
 * In short in overloading Signature must be different
 * Taken care by compiler hence called as compiletime polymorphism/early binding/static polymorphism
 */

class Overloading {

	static void fun2(int a) {
		System.out.println("Fun 2 static_example");
	}

	static void fun3(int a, int b) {
		System.out.println("Fun 3 static 2 param");
	}

	/**
	 * Below method will throw compile time error as
	 * in below method only return type is different which is don't care for overloading
	 * in order to method overload signature must be change
	 */
//	int fun(int a){
//		return 1;
//	}

	/**
	 * For overloading Name must be same and argument must be different
	 * Signature is combination of name and argument must be different, order or datatype
	 * return type is don't care
	 */
	void fun(int a) {
		System.out.println("fun with int argument");
	}

	void fun(int a, int b) {
		System.out.println("fun with 2 int arguments");
	}

	/**
	 * In below method as signature is different return type is don't care will work
	 */
	int fun(double a) {
		System.out.println("fun with float argument and return type");
		return 1;
	}

	/**
	 * overloading of private static and final is allowed
	 */
	private void fun1(int a) { //Private Method can not be called on base of object
		System.out.println("Fun 1 private");
	}

	final void fun3(int a) {
		System.out.println("Fun 3 final");
	}

	public void fun1(int a, int b) {
		fun1(a);
		System.out.println("Fun 1 public 2 param");
	}

	public void fun2(int a, int b) {
		System.out.println("Fun 2 public 2 param");
	}

	/**
	 * exception handling
	 * No restriction on exception handling
	 */
	void exceMethod() throws Exception {

	}

	void exceMethod(int a) {

	}
}

public class DemoOverloading {

	public static void main(String args[]) {
		Overloading obj = new Overloading();
		obj.fun(1);
		obj.fun(1.1);
		obj.fun1(3, 4);
		obj.fun2(4, 5);
		obj.fun2(7);
	}
}
