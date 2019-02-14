package com.design_pattern.singleton.demo5;

class SingletonInnerClass{
	private SingletonInnerClass() {
	}

	private static class Impl{
		private static final SingletonInnerClass INSTANCE
				= new SingletonInnerClass();
	}

	public static SingletonInnerClass getInstance(){
		return Impl.INSTANCE;
	}

}

public class DemoSingletonInnerClass {
	public static void main(String[] args) {
		SingletonInnerClass obj = SingletonInnerClass.getInstance();
		SingletonInnerClass obj2 = SingletonInnerClass.getInstance();
		System.out.println(obj.hashCode()== obj2.hashCode());
	}
}
