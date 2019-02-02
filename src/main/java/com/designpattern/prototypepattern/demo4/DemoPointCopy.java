package com.designpattern.prototypepattern.demo4;

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}

class Line {
	public Point start, end;

	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	public Line deepCopy() {
		return new Line(new Point(start.x,start.y),new Point(end.x,end.y));
	}

	public String toString() {
		return "Line{" +
				"start=" + start +
				", end=" + end +
				'}';
	}
}

public class DemoPointCopy {
	public static void main(String[] args) {
		Line line = new Line(new Point(1,2),new Point(3,4));
		Line line2 = line.deepCopy();

		line2.start.x = 15;
		System.out.println(line);
		System.out.println(line2);

	}
}
