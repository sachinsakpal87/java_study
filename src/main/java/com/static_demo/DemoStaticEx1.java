package java.staticdemo;

//static_example variable gets memory in class area Permanent generation memory
//Same variable is used for all the objects 
public class DemoStaticEx1 {

	static String CollegeName = "VNIT";
	String Studentname;
	int StudentRollno;

	DemoStaticEx1(String Studentname, int StudentRollno) {
		this.Studentname = Studentname;
		this.StudentRollno = StudentRollno;
	}

	public static void main(String[] args) {
		DemoStaticEx1 objDemoStaticEx1 = new DemoStaticEx1("sachin", 5);
		DemoStaticEx1 objDemoStaticEx2 = new DemoStaticEx1("rahul", 10);

		objDemoStaticEx1.display();
		objDemoStaticEx2.display();
	}

	void display() {
		System.out.println("name : " + Studentname + "\trollno : " + StudentRollno + "\tCollege : " + CollegeName);
	}
}
