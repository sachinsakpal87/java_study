package com.diamond_problem;

public interface InterfaceB {
	default void function() {
		System.out.println("Function of InterfaceB Called");
	}

	void function2();
}
