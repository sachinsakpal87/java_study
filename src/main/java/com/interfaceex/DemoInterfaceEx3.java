package com.interfaceex;

interface Ishowable2 {
	void show();
}

interface IPrintable2 extends Ishowable2 {
	void show();
	//void print();   This will also work just has to implement it in child class
}

class child3 implements IPrintable2 {

	@Override
	public void show() {
		System.out.println("Implemented the show function");
	}


}

public class DemoInterfaceEx3 {

	public static void main(String[] args) {
		Ishowable2 obj = new child3();
		obj.show();
	}
}
