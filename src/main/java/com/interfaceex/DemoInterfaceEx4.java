package com.interfaceex;

interface Ishowable3 {
	void show();

	interface IPrintable3 {
		void print();
	}
}

class child4 implements Ishowable3 {

	@Override
	public void show() {
		System.out.println("Implemented the show function");
	}
}

public class DemoInterfaceEx4 {

	public static void main(String[] args) {
		Ishowable2 obj = new child3();
		obj.show();
	}
}
