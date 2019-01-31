package java.overloading;

//Access modifier type don't care in case of overloading

public class DemoOverloadingDiffEx2 {

	public static void main(String[] args) {
		DemoOverloadingDiffEx2 obj = new DemoOverloadingDiffEx2();
		obj.fun();
	}

	public int fun(int a) {
		System.out.println("public is called");
		return a;
	}

	private void fun() {
		System.out.println("private is called");
	}

	protected void fun(float a) {
		System.out.println("protected is called");
	}

	void fun(double a) {
		System.out.println("default is called");
	}
}
