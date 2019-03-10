package com.static_demo;

public class DemoStaticEx3 {
	static String CollegeName = "VNIT";
	String Studentname;
	int StudentRollno;

	DemoStaticEx3(String Studentname, int StudentRollno) {
		this.Studentname = Studentname;
		this.StudentRollno = StudentRollno;
	}

	static void change() {
		CollegeName = "BITS";
	}

	public static void main(String[] args) {
		DemoStaticEx3.change();
		DemoStaticEx3 objDemoStaticEx1 = new DemoStaticEx3("sachin", 5);
		DemoStaticEx3 objDemoStaticEx2 = new DemoStaticEx3("rahul", 10);

		objDemoStaticEx1.display();
		objDemoStaticEx2.display();
	}

	void display() {
		System.out.println("name : " + Studentname + "\trollno : " + StudentRollno + "\tCollege : " + CollegeName);
	}
}
