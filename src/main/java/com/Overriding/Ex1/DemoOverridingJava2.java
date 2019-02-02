package com.overriding.Ex1;//package com.overriding.Ex1;

/**
 * Created by sachin on 10/8/17.
 */
class Parent {

	Object fun(Object... args) {
		System.out.println("Parent fun is called");
		return "";
	}

	String fun(String... args) {
		System.out.println("Parent fun is called");
		return "";
	}

	String fun(Integer... args) {
		System.out.println("Parent fun is called");
		return "";
	}
}

class Child extends Parent {
	@Override
	String fun(Object... args) {
		System.out.println("Child fun is called");
		return "";
	}

	@Override
	String fun(String... args) {
		System.out.println("Child fun is called");
		return "";
	}

	@Override
	String fun(Integer... args) {
		System.out.println("Child fun is called");
		return "";
	}
}

public class DemoOverridingJava2 {
	public static void main(String args[]) {
		Parent p = new Child();
		p.fun(new String("sachin"));
		p.fun(new String("sachin"));
//        p.fun(null);
	}
}
