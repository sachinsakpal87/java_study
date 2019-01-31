package java.overloading;

//Exception has no restriction in overloading

public class DemoOverloadingDiffEx4 {

	public static void main(String[] args) {
		DemoOverloadingDiffEx4 obj = new DemoOverloadingDiffEx4();
		obj.fun();
	}

	void fun(int a) throws Exception {
		System.out.println("public is called");
	}

	void fun() {
		System.out.println("private is called");
	}

	void fun(float a) {
		System.out.println("protected is called");
	}

	void fun(double a) {
		System.out.println("default is called");
	}
}
