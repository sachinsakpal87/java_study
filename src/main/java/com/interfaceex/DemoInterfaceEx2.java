package com.interfaceex;

interface Ishowable1 {
	void show();
}

interface IPrintable {
	void print();
}

class child2 implements Ishowable1, IPrintable {

	@Override
	public void show() {
		System.out.println("Implemented the show function");
	}

	@Override
	public void print() {
		System.out.println("Implemented the print function");
	}
}

public class DemoInterfaceEx2 {

	public static void main(String[] args) {
		Ishowable1 obj = new child2();
		obj.show();
		IPrintable obj1 = new child2();
		obj1.print();
	}
}
