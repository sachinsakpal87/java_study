package java.instanceofex;

class Animal2 {

}

class Dog2 extends Animal2 {
	static Dog2 obj = null;

	static void method(Animal2 a) {

		obj = (Dog2) a;
		System.out.println("ok downcasting performed");
	}
}

public class DemoInstanceOfEx4 {

	public static void main(String[] args) {
		Animal2 a = new Dog2();
		Dog2.method(a);

		Animal2 a1 = new Animal2();
		Dog2.method(a1);
	}
}
