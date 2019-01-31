package com.intervierw.questions;

import java.lang.reflect.InvocationTargetException;

class Students implements Cloneable {
	int rollNo;    //memory will be allocated at run time
	String name;

	Students() {
		this.rollNo = 0;
		this.name = null;
	}

	Students(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void show() {
		System.out.println("Roll no :: " + rollNo + " Name :: " + name);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class DemoObject {

	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {

		//Creating students object using new
		//{Object will get memory allocated in heap and reference of that object will
		//be stored in stack memory}

		Students objStudents1 = new Students(1, "sachin");
		Students objStudents2 = new Students(2, "rahul");

		objStudents1.show();
		objStudents2.show();

		//Creating object using new instance
		try {
			Students objStudents3 = Students.class.getDeclaredConstructor().newInstance();
			objStudents3.show();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Creating object using clone
		Students objStudents4 = (Students) objStudents2.clone();
		objStudents4.show();
	}
}
