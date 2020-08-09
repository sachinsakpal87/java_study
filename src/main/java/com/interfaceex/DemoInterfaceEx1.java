/**
 * interface Imoveable{
 * int AVERAGE-SPEED = 40;
 *  	void move();
 *  }
 *
 * Java compiler addes
 * interface Imoveable{
 * public static final int AVERAGE-SPEED = 40;
 * public abstract void move();
 *  }
 */
package com.interfaceex;

interface IinterF1 {
	void fun();
}

class child1 implements IinterF1 {

	@Override
	public void fun() {
		System.out.println("Implemented the function");
	}
}

public class DemoInterfaceEx1 {

	public static void main(String[] args) {
		IinterF1 obj = new child1();
		obj.fun();

//        DemoMainMethodOverloading.main();
	}
}
