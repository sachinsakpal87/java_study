package java.overloading;

//Access modifier type don't care in case of overloading

public class DemoOverloadingDiffEx3 {

	static void fun(float a) {
		System.out.println("protected is called");
	}

	public static void main(String[] args) {
		DemoOverloadingDiffEx3 obj = new DemoOverloadingDiffEx3();
		obj.fun();
		DemoOverloadingDiffEx3.fun(1.1f);
	}

	public int fun(int a) {
		System.out.println("public is called");
		return a;
	}

	private void fun() {
		System.out.println("private is called");
	}

	final void fun(double a) {
		System.out.println("default is called");
	}
}
