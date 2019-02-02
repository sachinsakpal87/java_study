package com.overriding.Ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class parent {

	static void fun9() {
	}

	Object test() {
		return null;
	}

	void fun1() {

	}

	Object fun2(Object obj) {
		return obj;
	}

	void fun3() throws Exception {
	}

	void fun4() {
	}

	void fun5() {
	}

	protected void fun6() {
	}

	void fun7() {
	}

	private void fun8() {
		System.out.println("fun8 of parent");
	}

	final void fun10() {
	}

	public void overloading(int i) {
		System.out.println("parent class example");
	}
}

class child extends parent {

/**
 * Below return type is not allowed
 * in overriding return type must be same or should be subset of parent
 */
//	int fun1(){
//		return 1;
//	}
//

//	Object fun2 (Object a){
//		return a;
//	}

	/**
	 * This is allowed as return type is string_demo and Integer are subtype of Object class
	 * below is not overriding as signature is different
	 */
	String fun2(String a) {
		return "";
	}

	Integer fun2(Integer a) {
		return a;
	}

	String test() {
		return null;
	}

	/**
	 * If child is throwing checked exception and parent should also throw that
	 * checked exception or base exception of that exception
	 */
	void fun3() throws IOException {
		FileWriter fw = new FileWriter(new File("abc.txt"));
	}

	/**
	 * If child is throwing unchecked exception or Error then for parent it is
	 * don't care means even if parent won't throw ant exception it is ok.
	 */
	void fun4() throws ArrayIndexOutOfBoundsException {

	}
	/**
	 * Below condition will give compile time error as below checked exception is
	 * not handle in parent
	 */
	//	void fun5() throws FileNotFoundException{
//		
//	}

	/**
	 * Increasing Scope is allowed but decreasing is not allowed
	 * If parent class is private then we can not override private method
	 * If parent class is protected the child must be protected or public
	 * If parent class is default the child must be default or protected or public
	 */
	public void fun6() {

	}

	@Override
	protected void fun7() {

	}
	/**
	 * Below code will give compile time exception as private method in base class can not be overridden
	 * @Override keyword is must for below method to give compile time error or else JVM will consider below method as
	 * private to that class
	 */
//	@Override
//	private void fun8(){
//		System.out.println("fun8 of child");
//	}

	/**
	 * Can not override static, private and final method
	 * Below code will throw Error
	 */
//	@Override
//	static void fun9(){
//
//	}
//	@Override
//	static void fun10(){
//
//	}
	public void overloading(int i, int j) {
		System.out.println("child class example");
	}
}

public class DemoOverridingJava {

	public static void main(String args[]) {
		child a = new child();
		parent p = new child();
		Integer i = Integer.valueOf(0);
		String s = null;
		Object o = null;

		/**
		 * This will throw an error as null ambiguous for child class
		 */
		//	a.fun2(null);
		a.fun2(new String());
		//p.fun2(new string_demo(null));
		a.test();
		try {
			a.fun3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//public class DemoOverloading {
//	
//	public static void main(string_demo args[]){
//		overloading obj = new overloading();
//		obj.fun(1);
//		obj.fun(1.1);
//	}
//	
//
//}
