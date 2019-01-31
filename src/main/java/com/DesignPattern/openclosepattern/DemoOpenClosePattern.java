package com.DesignPattern.openclosepattern;//package com.DesignPattern.openclosepattern;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//
//enum Color {
//	RED, GREEN, BLUE;
//}
//
//enum Size {
//	SMALL, MEDIUM, LARGE, HUGE;
//}
//
//interface ISpeficication<T> {
//	boolean isSatisfied(T item);
//}
//
//interface IFilter<T> {
//	Stream<T> filter(List<T> items, ISpeficication<T> spec);
//}
//
//class Product {
//	String name;
//	Color color;
//	Size size;
//
//	public Product(String name, Color color, Size size) {
//		this.name = name;
//		this.color = color;
//		this.size = size;
//	}
//}
//
//class ColorSpecification implements ISpeficication<Product> {
//
//	private Color color;
//
//	public ColorSpecification(Color color) {
//		this.color = color;
//	}
//
//	@Override
//	public boolean isSatisfied(Product item) {
//		return this.color == item.color;
//	}
//}
//
//class SizeSpecification implements ISpeficication<Product> {
//
//	private Size size;
//
//	public SizeSpecification(Size size) {
//		this.size = size;
//	}
//
//	@Override
//	public boolean isSatisfied(Product item) {
//		return this.size == item.size;
//	}
//}
//
//class Filter implements IFilter<Product> {
//
//	@Override
//	public Stream<Product> filter(List<Product> items
//			, ISpeficication<Product> spec) {
//		return items.stream().filter(item -> spec.isSatisfied(item));
//	}
//}
//
//class AndSpecification<T> implements ISpeficication<T> {
//
//	private ISpeficication<T> first;
//	private ISpeficication<T> second;
//
//	public AndSpecification(ISpeficication<T> first, ISpeficication<T> second) {
//		this.first = first;
//		this.second = second;
//	}
//
//	@Override
//	public boolean isSatisfied(T item) {
//		return first.isSatisfied(item) && second.isSatisfied(item);
//	}
//}
//
//@Deprecated
//class FilterProduct {
//	public Stream<Product> filterByColor(List<Product> product, Color color) {
//		return product.stream().filter(p -> p.color == color);
//	}
//
//	public Stream<Product> filterBySize(List<Product> product, Size size) {
//		return product.stream().filter(p -> p.size == size);
//	}
//
//	public Stream<Product> filterBySizeAndColor(List<Product> product
//			, Size size
//			, Color color) {
//		return product.stream().filter(p -> p.size == size && p.color == color);
//	}
//}
//
//public class DemoOpenClosePattern {
//	public static void main(String[] args) {
//		final Product apple = new Product("Apple", Color.RED, Size.SMALL);
//		final Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);
//		final Product house = new Product("House", Color.BLUE, Size.HUGE);
//		final Product car = new Product("Car", Color.GREEN, Size.LARGE);
//
//		Stream<Product> stream = Stream.of(apple, tree, house, car);
//
//		List<Product> products = new ArrayList<>();
//		products.add(apple);
//		products.add(tree);
//		products.add(house);
//		products.add(car);
//
////        final FilterProduct filterProduct = new FilterProduct();
////        filterProduct.filterByColor(products,Color.GREEN)
////                .forEach(entry -> System.out.println(entry.name+" "+entry.color));
////
////        filterProduct.filterBySizeAndColor(products,Size.HUGE,Color.BLUE)
////                .forEach(p-> System.out.println(p.color+" "+p.size+" "+p.name));
//
////        final Filter filter = new Filter();
////        final ColorSpecification colorSpecification = new ColorSpecification(Color.BLUE);
////        filter.filter(products, colorSpecification)
////                .forEach(product -> System.out.println(product.name + " " + product.color));
////        filter.filter(products, new AndSpecification<>(
////                new ColorSpecification(Color.RED),
////                new SizeSpecification(Size.SMALL)
////        )).forEach(product -> System.out.println(product.name + " " + product.color + " " + product.size));
//
//		final Filter filter = new Filter();
//		filter
//				.filter(products, new ColorSpecification(Color.GREEN))
//				.forEach(p -> System.out.println("Gree Products ::"));
//	}
//}
