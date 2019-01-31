package com.generics;

class Store {
	private Object item;

	public void Store(Object item) {
		this.item = item;
	}

	public Object getItem() {
		return this.item;
	}

	@Override
	public String toString() {
		return item.toString();
	}
}

class BetterStore<T> {
	private T item;

	public void Store(T item) {
		this.item = item;
	}

	public T getItem() {
		return this.item;
	}

	@Override
	public String toString() {
		return item.toString();
	}
}

public class DemoStore {
	public static void main(String[] args) {
		final Store store = new Store();
		store.Store(45);
		Integer i = (Integer) store.getItem();
		System.out.println(store);

		final BetterStore<Integer> BetterStore = new BetterStore<>();
		BetterStore.Store(45);
		Integer j = BetterStore.getItem();
		System.out.println(BetterStore);

		final com.generics.BetterStore<String> BetterStore1 = new BetterStore<>();
		BetterStore1.Store("45");
//        Integer k = BetterStore1 .getItem();
		String k = BetterStore1.getItem();
		System.out.println(BetterStore1);
	}
}
