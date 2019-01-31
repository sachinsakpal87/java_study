package com.DesignPattern.factorypattern.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.reflections.Reflections;

class Pair<K,V>{
	K k;
	V v;

	public Pair(K k, V v) {
		this.k = k;
		this.v = v;
	}

	public K getKey() {
		return this.k;
	}

	public V getValue() {
		return this.v;
	}
}

interface HotDrink {
	void consume();
}

class Tea implements HotDrink {
	public void consume() {
		System.out.println("Tea is awesome !!");
	}
}

class Coffee implements HotDrink {
	public void consume() {
		System.out.println("Coffee is delicious");
	}
}

interface HotDrinkFactory {
	HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory {
	public HotDrink prepare(int amount) {
		System.out.println("Teabag + boiling water + Ginger +pour amount " + amount
				+ "ml" + "enjoy!!");
		return new Tea();
	}
}

class CoffeeFactory implements HotDrinkFactory {
	public HotDrink prepare(int amount) {
		System.out.println("Grind coffee beans + boiling water + pour amount " + amount
				+ "ml cream and sugar." + " enjoy!!");
		return new Coffee();
	}
}

class HotDrinkMachine {
	List<Pair<String, HotDrinkFactory>> hotDrinkList = new ArrayList<>();

	HotDrinkMachine() throws Exception {
		Reflections reflections = new Reflections("com.DesignPattern.factorypattern.demo");
		Set<Class<? extends HotDrinkFactory>> types =
				reflections
				.getSubTypesOf(HotDrinkFactory.class);
		for (Class<? extends HotDrinkFactory> c : types) {
			hotDrinkList.add(new Pair<String, HotDrinkFactory>
					(c.getSimpleName().replace("Factory", "")
							, c.getDeclaredConstructor().newInstance()));
		}
	}

	HotDrink makeDrink() {
		int index, amount;
		System.out.println("*************** Welcome to CCD ***************");
		System.out.println("**********************************************");
		System.out.println("Select your favorite drink");
		while (true) {
			for (int i = 1; i <= hotDrinkList.size(); ++i) {
				System.out.println(i + " : " + hotDrinkList.get(i - 1).getKey());
			}
			Scanner scanner = new Scanner(System.in);
			index = scanner.nextInt();
			if (index > 0 && index <= hotDrinkList.size()) {
				System.out.println("**********************************************");
				System.out.println("Provide amount in ml ");
				amount = scanner.nextInt();
				if (amount >= 0) {
					return hotDrinkList.get(index - 1).getValue().prepare(amount);
				} else {
					System.out.println("amount should be > 0");
				}
			} else {
				System.out.println("select valid drink");
			}
		}
	}
}

public class DemoAbstractFactoryMethod {
	public static void main(String[] args) throws Exception {
		new HotDrinkMachine().makeDrink();
	}
}
