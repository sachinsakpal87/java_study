package com.oops.inheritance;

class ClsParent1 {

	ClsParent1() {
		System.out.println("Parent class constructor");
	}

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
		System.out.println("Parent Class Private funtion fun4 called");
	}

	void fun6() {
		System.out.println("Only in Parent Class funtion fun6 called");
	}
}

class ClsChild1 extends ClsParent1 {

	public ClsChild1() {
		System.out.println("Child class constructor");
	}

	static void fun2() {
		System.out.println("Child Class static_example funtion fun2 called");
	}

	@Override
	void fun1() {
		System.out.println("Child Class funtion fun1 called");
	}

	private void fun3() {
		System.out.println("Child Class Private funtion fun3 called");
	}

	protected void fun4() {
		System.out.println("Child Class protected funtion fun4 called");
	}

	void fun5() {
		System.out.println("Only in Child Class funtion fun5 called");
	}

//    void funx (int i, float b){}
//    void funx (float i, int b){}
}

public class DemoParentChildWChildMethodOnly {

	public static void main(String[] args) {

		ClsParent1 pObj = new ClsParent1();
		ClsChild1 cObj = new ClsChild1();
		ClsParent1 pcObj = new ClsChild1();


//        cObj.funx(1,1);

		pObj.fun1();
		pObj.fun2();
		pObj.fun4();
		pObj.fun6();
		// pObj.fun5();

		System.out.println("\n\n");

		cObj.fun1();
		cObj.fun2();
		cObj.fun4();
		cObj.fun5();
		cObj.fun6();

		System.out.println("\n\n");

		pcObj.fun1();
		pcObj.fun2();
		pcObj.fun4();
		// pcObj.fun5();
		pcObj.fun6();
	}
}
