package com.Overriding.Ex1;

class Parent1 {

	void fun() {
		System.out.println("Parent fun is called");
	}

	void fun1(String obj, int abc) {
		System.out.println("Parent fun1 is called");
	}

	void fun2(Object obj) {
		System.out.println("Parent fun2 is called");
	}

	void fun3() {
		System.out.println("Parent fund3");
	}
}

class Child1 extends Parent1 {

	@Override
	void fun() {
		System.out.println("Child fun is called");
	}

	@Override
	void fun1(String obj, int abc) {
		System.out.println("Child fun1 is called");
	}

	//	@Override this is not overriden to override signature and name should be same
	void fun2(String test) {
		fun3();
		System.out.println("Child fun2 is called");
	}
}

public class MethodNameEx {

	public static void main(String[] args) {
		Parent1 p = new Parent1(); //All the Parent function accessible
		Child1 c = new Child1();    //All the Child as well as Parent function are accessible
		Parent1 pc = new Child1();    //All the Child functions which are also present in parent
		//Or else all the child

		//Only Parent
		p.fun();
		p.fun1("", 1);
		p.fun2(1);
		p.fun2("");

		System.out.println("");

		//Only Child
		c.fun();
		c.fun1("", 1);
		c.fun2(1);
		c.fun2("");

		System.out.println("");

		//Parent obj of child
		pc.fun();
		pc.fun1("", 1);
		pc.fun2(1);
		pc.fun2("str");

		/*
        Parent fun is called
		Parent fun1 is called
		Parent fun2 is called
		Parent fun2 is called
		Child fun is called
		Child fun1 is called
		Parent fun2 is called
		Child fun2 is called
		Child fun is called
		Child fun1 is called
		Parent fun2 is called
		Parent fun2 is called

		 */

	}
}
