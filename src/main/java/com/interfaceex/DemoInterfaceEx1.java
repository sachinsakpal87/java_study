package java.interfaceex;

interface IinterF1 {
	void fun();
}

class child1 implements IinterF1 {

	@Override
	public void fun() {
		System.out.println("Implemented the function");
	}
}

public class DemoInterfaceEx1 {

	public static void main(String[] args) {
		IinterF1 obj = new child1();
		obj.fun();

//        DemoMainMethodOverloading.main();
	}
}
