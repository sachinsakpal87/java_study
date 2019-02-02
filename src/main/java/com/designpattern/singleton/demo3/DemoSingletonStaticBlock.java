package com.designpattern.singleton.demo3;

class SingletonStaticBlock{
	public static SingletonStaticBlock demoSingletonStaticBlock;
	private SingletonStaticBlock() {

	}

	static {
		demoSingletonStaticBlock = new SingletonStaticBlock();
	}

	public static SingletonStaticBlock getInstance(){
		return demoSingletonStaticBlock;
	}

}

public class DemoSingletonStaticBlock {

	public static void main(String[] args) {
		SingletonStaticBlock obj = SingletonStaticBlock.getInstance();
		SingletonStaticBlock obj2 = SingletonStaticBlock.getInstance();

		System.out.println(obj.hashCode()== obj2.hashCode());
	}
}
