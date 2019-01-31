package java.instanceofex;

class Animal1 {

}

class Dog1 extends Animal1 {
	static Dog1 obj = null;

	static void method(Animal1 a) {
		if (a instanceof Dog1) {
			obj = (Dog1) a;
			System.out.println("ok downcasting performed");
		}
	}
}

public class DemoInstanceOfEx3 {

	public static void main(String[] args) {
		Animal1 a = new Dog1();
		Dog1.method(a);

		Animal1 a1 = new Animal1();
		Dog1.method(a1);
	}
}
