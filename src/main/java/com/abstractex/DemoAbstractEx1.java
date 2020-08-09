//1. You can not instantiate abstract class
//2. It will let other classes inherit from it but can not be instantiated by itself
//3. Class cna only inherit from one abstract class
//4. Abstract class is real class it can have access modifiers but for interface everything is considered as public by default
//5. Abstract class can provide code
//6. It takes more time to add new methods to an interface. Code has to be rewritten for the interface and for all classes that refer to it include the new methods. It’s easier to add code to an abstract class, because we can use it as the default implementation. The program will still continue to run properly.
//7.If a class have abstract methods, then the class should also be abstract using abstract keyword, else it will not compile.
//8.It’s not necessary for an abstract class to have abstract method. We can mark a class as abstract even if it doesn’t declare any abstract methods.
//9.If abstract class doesn’t have any method implementation, its better to use interface because java doesn’t support multiple class inheritance.
//10.The subclass of abstract class in java must implement all the abstract methods unless the subclass is also an abstract class.
//11.Java Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.

package com.abstractex;

abstract class A {

	abstract void fun();

	void test() {
		System.out.println("This is test function");
	}


}

class B extends A {

	@Override
	void fun() {
		System.out.println("Abstract method is implemented");
	}
}

public class DemoAbstractEx1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.fun();
		obj.test();
	}
}
