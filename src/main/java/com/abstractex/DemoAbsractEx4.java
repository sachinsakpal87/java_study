package com.abstractex;

interface IFirst{
	default void test(){
		System.out.println("Interface test method");
	}
}
abstract class AbstractBase{
	public void test(){
		System.out.println("Abstract test method");
	}
}

class ChildClass extends AbstractBase implements IFirst{

}
public class DemoAbsractEx4 {
	public static void main(String[] args) {
		IFirst obj = new ChildClass();
		obj.test();
	}
}
