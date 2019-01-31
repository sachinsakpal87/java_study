package com.generics;

import java.util.List;

class Bucket<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}

public class DemoTypeInferior {

	public static void main(String[] args) {

	}

	public <T> void doSomething(T item, List<Bucket<T>> bucket) {
		final Bucket<T> tBucket = new Bucket<>();
		tBucket.setItem(item);
		bucket.add(tBucket);
		System.out.println();
	}
}
