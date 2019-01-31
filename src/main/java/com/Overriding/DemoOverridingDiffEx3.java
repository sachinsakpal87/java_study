package java.overriding;

//private static final can not be overriden overriding

class Parent8 {
	static void fun2() {
		System.out.println("Parent class protected fun2 is called");
	}

	final void fun() {
		System.out.println("Parent class default fun is called");
	}

	private void fun3() {
		System.out.println("Parent class private fun3 is called");
	}
}

class Child8 extends Parent8 {
//	 void fun(){
//		System.out.println("Child class fun is called");
//		
//	}
//	
//	
//	void fun2() {
//		System.out.println("Child class fun2 is called");
//	}
//	
//	void fun3() {
//		System.out.println("Child class private fun3 is called");
//
//	}
}

public class DemoOverridingDiffEx3 {

	public static void main(String[] args) {
		Parent8 obj = new Parent8();
		Parent8 obj2 = new Child8();
		Child8 obj3 = new Child8();

		obj.fun();
		obj2.fun();
		obj3.fun();
		obj.fun2();
		obj2.fun2();
		obj3.fun2();
//		obj.fun3();
//		obj2.fun3();
//		obj3.fun3();

	}
}
