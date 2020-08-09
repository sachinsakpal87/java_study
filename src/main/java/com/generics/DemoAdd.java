package com.generics;

class Addition {

	public int add(int i, int j) {
		return i + j;
	}

	public double add(double i, double j) {
		return i + j;
	}

	public float add(float i, float j) {
		return i + j;
	}

	public String add(String i, String j) {
		return i + j;
	}
}

class BetterAddition<T extends Number> {
	T i, j;

	BetterAddition(T i, T j) {
		this.i = i;
		this.j = j;
	}

	public T add() {
//        return i+j;
		return  null;
	}
}

public class DemoAdd {
	public static void main(String[] args) {
		final Addition addition = new Addition();
		System.out.println(addition.add(1.1, 2));
	}
}
