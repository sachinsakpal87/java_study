package com.intervierw.questions;

class DemoThis {

	private int x;
	private int y;

	DemoThis(int y) {
		this.y = y;
		System.out.println("Value of y " + this.y);
	}

	DemoThis(int x, int y) {
		/*
		 * this is used to call the constuctors within same class
		 */
		this(y);

		/*
		 * this is a final variable in java you can not assign value to it. Doing so will result in
		 * compile time error as shown in below example
		 *
		 */
		//this = "XYZ";

		/*this always refer to instance variable of an object, if the instance variable and local
		 * variable names are same
		 */
		this.x = x;

		System.out.println("Value of x " + this.x);

		/*
		 * Calling non static method
		 */
		this.print();
		/*
		 * Passing this as a parameter
		 */
		this.show(this, "Successful");
	}

	public void show(DemoThis obj, String message) {
		System.out.println("Passing this as parameter " + obj.x + " " + obj.y + " messages is " + message);
	}

	public void print() {
		System.out.println("Non static method " + x + " " + y);
	}

	/*
	 * Returning this
	 */
	public DemoThis getDemoThis() {
		return this;
	}
}

public class DemoThisKeyword {

	public static void main(String[] args) {
		DemoThis objDemoThis = new DemoThis(5, 9);
		DemoThis testObj = objDemoThis.getDemoThis();
		testObj.print();
	}
}
