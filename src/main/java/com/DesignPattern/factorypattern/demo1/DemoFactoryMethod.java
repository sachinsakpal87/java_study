package com.DesignPattern.factorypattern.demo1;

class Point{
	double x,y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static Point newCartitionCoordinate(double x, double y){
		return new Point(x,y);
	}

	public static Point newPolarCoordinate(double roh, double theta){
		return new Point((roh* Math.cos(theta)),(roh* Math.sin(theta)));
	}

	public String toString() {
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}

public class DemoFactoryMethod {
	public static void main(String[] args) {
		Point cartitionCoordinate = Point.newCartitionCoordinate(1, 5);
		Point polarCoordinate = Point.newPolarCoordinate(7.5, 20);
		System.out.println(cartitionCoordinate + System.lineSeparator()+polarCoordinate);
	}

}
