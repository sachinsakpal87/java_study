package java.overriding;

//Access modifier user is not allowed to reduce the scope of access modifier overriding

class Parent7 {
	void fun() {
		System.out.println("Parent class default fun is called");
	}

	protected void fun2() {
		System.out.println("Parent class protected fun2 is called");
	}

	private void fun3() {
		System.out.println("Parent class private fun3 is called");
	}
}

class Child7 extends Parent7 {
	public void fun() {
		System.out.println("Child class fun is called");
	}

	@Override
	protected void fun2() {
		System.out.println("Child class fun2 is called");
	}

	private void fun3() {
		System.out.println("Child class private fun3 is called");
	}
}

public class DemoOverridingDiffEx2 {

	public static void main(String[] args) {
		Parent7 obj = new Parent7();
		Parent7 obj2 = new Child7();
		Child7 obj3 = new Child7();

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
