package com.instance_initializer_block;
class InstanceInitializer{
	InstanceInitializer(){
		System.out.println("Constructor called");
	}
	static{
		System.out.println("Instance initializer block is called");
	}
}
public class DemoInstanceInitializer {

	public static void main(String[] args) {
		InstanceInitializer obj = new InstanceInitializer();
	}
}
