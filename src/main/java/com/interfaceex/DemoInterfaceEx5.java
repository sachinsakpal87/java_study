package com.interfaceex;
interface IFirst{
	default void fun(){
		System.out.println("IFirst");
	}

	void fun2();
	void fun3();
}

interface ISecond extends IFirst{
	default void fun(){
		System.out.println("Second");
	}

	void fun2();
	void fun4();
}
abstract class Aabstract{
//	public void fun(){
//		System.out.println("Abstract");
//	}
}
class CFun extends  Aabstract implements ISecond, IFirst{

	public void fun3() {
		System.out.println("Fun 3");
	}

//	public void fun() {
//		super.fun();
//	}

	public void fun2() {
		System.out.println("Fun 2");
	}

	public void fun4() {
		System.out.println("Fun 4");
	}
}
public class DemoInterfaceEx5 {
	public static void main(String[] args) {
		IFirst c = new CFun();
		c.fun();
	}
}
