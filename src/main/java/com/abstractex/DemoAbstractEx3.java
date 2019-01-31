package java.abstractex;

interface Iinterface {
	void f1();

	void f2();

	void f3();

	void f4();
}

abstract class Abstractclass implements Iinterface {

	public void f4() {
		System.out.println("f4 is called");
	}

	abstract void f5();
}

class Chld1 extends Abstractclass {

	@Override
	public void f1() {
		System.out.println("f1 is called");
	}

	@Override
	public void f2() {
		System.out.println("f2 is called");
	}

	@Override
	public void f3() {
		System.out.println("f3 is called");
	}

	@Override
	void f5() {
		System.out.println("f5 is called");
	}
}

public class DemoAbstractEx3 {

	public static void main(String[] args) {
		Iinterface obj = new Chld1();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
		Abstractclass obj1 = new Chld1();
		obj1.f5();
	}
}
