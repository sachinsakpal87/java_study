package java.abstractex;

abstract class Shape {

	abstract void draw();
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Triangle is drawn");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle is drawn");
	}
}

public class DemoAbstractEx2 {

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		triangle.draw();
		Shape circle = new Circle();
		circle.draw();
	}
}
