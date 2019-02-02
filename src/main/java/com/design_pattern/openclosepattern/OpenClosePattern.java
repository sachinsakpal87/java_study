package com.design_pattern.openclosepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface ISpecification<T>{
	boolean isMatched(T item);
}

interface IFilter<T>{
	Stream<T> filter(List<T> items, ISpecification<T> spec);
}

class ColorSpecification implements ISpecification<Product> {
	private Color color;
	public ColorSpecification(Color color) {
		this.color = color;
	}
	public boolean isMatched(Product item) {
		return this.color==item.color;
	}
}

class SizeSpecification implements ISpecification<Product> {
	private Size size;
	public SizeSpecification(Size size) {
		this.size = size;
	}
	public boolean isMatched(Product item) {
		return this.size==item.size;
	}
}

class AndSpecification<T> implements ISpecification<T> {
	ISpecification<T> first;
	ISpecification<T> second;

	public AndSpecification(ISpecification<T> first, ISpecification<T> second) {
		this.first = first;
		this.second = second;
	}

	public boolean isMatched(T item) {
		return first.isMatched(item)&&second.isMatched(item);
	}
}

class Filter implements IFilter<Product> {
	public Stream<Product> filter(List<Product> items, ISpecification<Product> spec) {
		return items.stream().filter(product -> spec.isMatched(product));
	}
}

enum Color {
	RED, GREEN, BLUE;
}

enum Size {
	SMALL, MEDIUM, LARGE;
}

class Product {
	public String name;
	public Color color;
	public Size size;

	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}

class FilterProduct {
	public Stream<Product> filterByColor(Product p, Color c) {
		return Stream.of(p).filter(pe -> pe.color == c);
	}

	public Stream<Product> filterBySize(Product p, Size s) {
		return Stream.of(p).filter(pe -> pe.size == s);
	}

	public Stream<Product> filterByColorAndSize(Product p, Color c, Size s) {
		return Stream.of(p).filter(pe -> pe.color == c && pe.size == s);
	}
}

public class OpenClosePattern {
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product laptop = new Product("Laptop", Color.BLUE, Size.MEDIUM);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);

//		Stream stream = Stream.of(apple, laptop, tree);

		List<Product> productList = new ArrayList<>();
		productList.add(apple);productList.add(laptop);productList.add(tree);

		Filter filter = new Filter();
		filter.filter(productList,new ColorSpecification(Color.GREEN))
				.forEach(p-> System.out.println("Product is "+p.name+" and color is "+p.color));

		filter.filter(productList, new AndSpecification<>(
				new ColorSpecification(Color.GREEN),
				new SizeSpecification(Size.LARGE)))
				.forEach(p-> System.out.println("Product is "+p.name+" and color is "+p.color+" and size is "+p.size));;
	}
}
