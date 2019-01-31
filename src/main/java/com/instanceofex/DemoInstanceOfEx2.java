package java.instanceofex;

class Animal {

}

class Dog extends Animal {

}

public class DemoInstanceOfEx2 {

	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);

		//If we perform downcasting by typecasting, ClassCastException is thrown at runtime.
		Dog d = (Dog) new Animal();
		//System.out.println(d instanceof Dog);

	}
}
