package com.overriding_example.Ex1;

class ParentC {
	public Object function() {
		System.out.println("Parent class");
		return null;
	}
}

class ChildC extends ParentC {
	public Integer function() {
		System.out.println("Child class");
		return null;
	}
//same function is already present in child class hence
//	public String function(){
//		return null;
//	}
}

public class DemoOverridingCovarient {

	public static void main(String[] args) {
		ParentC p = new ChildC();
		p.function();
	}
}
