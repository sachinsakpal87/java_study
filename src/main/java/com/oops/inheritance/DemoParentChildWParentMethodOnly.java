package com.oops.inheritance;

class ClsParent3 {

	static void fun2() {
		System.out.println("Parent Class Static funtion fun2 called");
	}

	void fun1() {
		System.out.println("Parent Class funtion fun1 called");
	}

	private void fun3() {
		System.out.println("Parent Class Private funtion fun3 called");
	}

	protected void fun4() {
		System.out.println("Parent Class protected funtion fun4 called");
	}
}

class ClsChild3 extends ClsParent3 {

}

public class DemoParentChildWParentMethodOnly {

	public static void main(String[] args) {

		ClsParent3 pObj = new ClsParent3();
		ClsChild3 cObj = new ClsChild3();
		ClsParent3 pcObj = new ClsChild3();

		pObj.fun1();
		pObj.fun2();
		pObj.fun4();

		cObj.fun1();
		cObj.fun2();
		cObj.fun4();

		pcObj.fun1();
		pcObj.fun2();
		pcObj.fun4();
	}
}
