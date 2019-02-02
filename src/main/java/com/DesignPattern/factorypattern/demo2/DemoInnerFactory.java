package com.designpattern.factorypattern.demo2;

class Point{
	double x,y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}

	static class Factory{
		public static Point newCartitionCoordinate(double x, double y){
			return new Point(x,y);
		}

		public static Point newPolarCoordinate(double roh, double theta){
			return new Point((roh* Math.cos(theta)),(roh* Math.sin(theta)));
		}
	}
}

public class DemoInnerFactory {
	public static void main(String[] args) {
		Point cartitionCoordinate = Point.Factory.newCartitionCoordinate(4,6);
		Point polarCoordinate = Point.Factory.newPolarCoordinate(7.5, 20);
		System.out.println(cartitionCoordinate + System.lineSeparator()+polarCoordinate);
	}
}
