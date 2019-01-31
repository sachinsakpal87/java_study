package com.serialization;

import java.io.Serializable;

public class Rectangle implements Serializable {

	int height, width;

	Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return 2 * (width + height);
	}
}
