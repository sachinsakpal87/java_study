package java.overloading;

public class DemoOverloadingEx7 {

	public static void main(String[] args) {
		DemoOverloadingEx7 objDemoOverloadingEx7 = new DemoOverloadingEx7();
		objDemoOverloadingEx7.fun(0);
		objDemoOverloadingEx7.fun(new String());
		objDemoOverloadingEx7.fun(Integer.valueOf(0));
		//	objDemoOverloadingEx7.fun(null);
		objDemoOverloadingEx7.fun(new Object());
	}

	void fun(Object obj) {
		System.out.println("Object called");
	}

	void fun(String obj) {
		System.out.println("string_demo called");
	}

	void fun(Integer obj) {
		System.out.println("Integer called");
	}

	void fun(int obj) {
		System.out.println("int called");
	}
}
