package com.DesignPattern.singleton.demo9;

import java.util.function.Supplier;

class SingletonTester
{
	static boolean flag;
	public static boolean isSingleton(Supplier<Object> func){
		return func.get().hashCode() == func.get().hashCode();
	}
}

public class DemoIsSingleton {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("Is Singleton "+ SingletonTester.isSingleton(() -> obj));
		System.out.println("Is Singleton "+ SingletonTester.isSingleton(Object::new));
	}
}

