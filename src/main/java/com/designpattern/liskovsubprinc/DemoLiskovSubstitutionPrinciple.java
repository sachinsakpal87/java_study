package com.designpattern.liskovsubprinc;

class Rectangle{
	int width,height;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		return "Width is "+getWidth()+" and height is "+getHeight();
	}

	public int area(){
		return this.width * this.height;
	}
}

class Square extends Rectangle {

	public Square(){

	}
	public Square(int side) {
		width =height =side;
	}

	public int getWidth() {
		return super.getWidth();
	}

	public int getHeight() {
		return super.getHeight();
	}

	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}

public class DemoLiskovSubstitutionPrinciple {
	public static void useIT(Rectangle rectangle){
		int width = rectangle.getWidth();
		rectangle.setHeight(10);
		System.out.println("Expected area is "+width*rectangle.getHeight()+" and Actual" +
				"area is "+rectangle.area());
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);
		useIT(rectangle);

		Rectangle square = new Square();
		square.setHeight(10);
		square.setWidth(15);
		useIT(square);
	}
}
