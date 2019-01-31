package java.Inheritance;

class Parent2 {

	/*below parameter less constructor is mandatory as
	 * child's default constructor will super() as first line to its default constructor
	 * */
	public Parent2() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}

	Parent2(int b) {
		System.out.println("Parent Class Default Constructor ....!!!");
	}
}

class Child2 extends Parent2 {

}

public class DemoInheritanceEx2 {

	public static void main(String[] args) {
		Child2 objC = new Child2();
		System.out.println();
		Parent2 objP = new Child2();
		System.out.println();
	}
}
