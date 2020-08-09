package com.abstractex;

abstract class Shape {

	String obj;
	abstract void draw();
	void print(){
		System.out.println("Printing "+obj);
	}
}

class Triangle extends Shape {

	@Override
	void draw() {
		obj = "Tringle";
		System.out.println("Triangle is drawn");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		obj = "Circle";
		System.out.println("Circle is drawn");
	}
}

public class DemoAbstractEx2 {

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.print();
		Shape circle = new Circle();
		circle.draw();
		circle.print();
	}
}
