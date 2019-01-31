package java.overriding;

//Return type should be same or covarient  in case of overriding
class Parent6 {
	Object fun() {
		System.out.println("Parent class fun is called");
		return null;
	}

	String fun2() {
		System.out.println("Parent class fun2 is called");
		return null;
	}
}

class Child6 extends Parent6 {
	String fun() {
		System.out.println("Child class fun is called");
		return null;
	}

	@Override
	String fun2() {
		System.out.println("Child class fun2 is called");
		return null;
	}
}

public class DemoOverridingDiffEx1 {

	public static void main(String[] args) {
		Parent6 obj = new Parent6();
		Parent6 obj2 = new Child6();
		Child6 obj3 = new Child6();

		obj.fun();
		obj2.fun();
		obj3.fun();
		obj.fun2();
		obj2.fun2();
		obj3.fun2();
	}
}
