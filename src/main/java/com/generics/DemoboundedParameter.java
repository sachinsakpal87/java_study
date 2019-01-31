package com.generics;

import java.util.ArrayList;
import java.util.List;

interface Shape{
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing circle...");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing rectangle...");
	}
}

public class DemoboundedParameter {
	public static void drawAll(List<? extends Shape> all){
		for (Shape shape : all){
			shape.draw();
		}
	}
	public static void main(String[] args) {
//		Shape rectangle = new Rectangle();
//		Shape circle = new Circle();
//
//		rectangle.draw();
//		circle.draw();

		List<Shape> lst = new ArrayList<>();
		lst.add(new Rectangle());
		lst.add(new Circle());

		List<Circle> lstCircle = new ArrayList<>();
		lstCircle.add(new Circle());
		lstCircle.add(new Circle());

		List<Rectangle> lstRectangle = new ArrayList<>();
		lstRectangle.add(new Rectangle());
		lstRectangle.add(new Rectangle());


		DemoboundedParameter.drawAll(lstCircle);
		DemoboundedParameter.drawAll(lstRectangle);

	}

}
