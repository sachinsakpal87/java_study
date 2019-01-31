package java.Inheritance;

class Parent3 {

	Parent3(int b) {
		System.out.println("Parent Class Default Constructor ....!!!");
	}
}

class Child3 extends Parent3 {

	/*
	 * Below code is mandatory as in parent class default constructor is not present
	 * so compiler will add super() keyword in child's constructor this super keyword will then try
	 * to find default constructor in parent class which we have not provided
	 * hence below super(b) is important
	 */
	Child3(int b) {
		super(b);
	}
}

public class DemoInheritanceEx3 {

	public static void main(String[] args) {
		Child3 objC = new Child3(5);
		System.out.println();
		Parent3 objP = new Child3(5);
		System.out.println();
	}
}
