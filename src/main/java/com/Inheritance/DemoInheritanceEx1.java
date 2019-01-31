package java.Inheritance;

class Parent1 {

	Parent1() {
		System.out.println("Parent Class Default Constructor ....!!!");
	}
}

class Child1 extends Parent1 {
	Child1() {
		System.out.println("Child class Default Constuctor");
	}
}

public class DemoInheritanceEx1 {

	public static void main(String[] args) {
		Child1 objC = new Child1();
		System.out.println();
		Parent1 objP = new Child1();
		System.out.println();
		Parent1 objCP = new Parent1();
	}
}

/*
 * OP
 * Parent Class Default Constructor ....!!!
Child class Default Constuctor

Parent Class Default Constructor ....!!!
Child class Default Constuctor

Parent Class Default Constructor ....!!!

 */
