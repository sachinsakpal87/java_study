package com.generics;

class GenericMethod {

	//    To make method as generic no matter if it returns void we need to define dimond brackets <T> in signature
	public <T> void fun(T t) {
		System.out.println(t.toString());
	}

	//    To make method as generic with return we need to define return type infront of dimond brackets <T> in signature
	public <T> T funWithReturn(T t) {
		return t;
	}
}

public class DemoGenericMethod {
	public static void main(String[] args) {
		final GenericMethod genericMethod = new GenericMethod();
		genericMethod.fun("Hello World");
		genericMethod.fun('H');
		genericMethod.fun(45);

		System.out.println();
		System.out.println(genericMethod.funWithReturn("Hello World"));
		System.out.println(genericMethod.funWithReturn('H'));
		System.out.println(genericMethod.funWithReturn(55));
	}
}
