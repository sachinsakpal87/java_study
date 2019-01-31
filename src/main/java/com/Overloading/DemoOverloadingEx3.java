package java.overloading;

//Return type is not consider during overloading
public class DemoOverloadingEx3 {

	public static void main(String[] args) {
		DemoOverloadingEx3 objDemoOverloadingEx3 = new DemoOverloadingEx3();
		objDemoOverloadingEx3.sum(2, 5);
	}

	//	public int sum(int a,int b){
//		return a+b;
//	}
	public double sum(int a, int b) {
		return a + b;
	}
}
