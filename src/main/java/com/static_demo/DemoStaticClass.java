package com.static_demo;

class D {

	static class B {
		void fun() {

		}
	}

	class C {
		void fun() {

		}
	}
}

public class DemoStaticClass {
	DemoStaticClass demo = new DemoStaticClass();

	;

	void fun() {
	}

	public void main(String[] args) {
		D d = new D();
		D.B b = new D.B();
		b.fun();
		demo.fun();
	}
}
