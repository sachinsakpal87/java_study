package com.oops.inheritance;

class ClsParent2 {

	static void fun2() {
		System.out.println("Parent Class static_example funtion fun2 called");
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

class ClsChild2 extends ClsParent2 {

}

public class DemoParentChildWParentChildMethod {

	public static void main(String[] args) {

		ClsParent2 pObj = new ClsParent2();
		ClsChild2 cObj = new ClsChild2();
		ClsParent2 pcObj = new ClsChild2();

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
