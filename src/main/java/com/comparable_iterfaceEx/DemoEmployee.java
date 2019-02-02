package com.comparable_iterfaceEx;

import java.util.Collections;
import java.util.LinkedList;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		LinkedList<Employee> ObjEmp = new LinkedList<Employee>();

		Employee e = new Employee();
		ObjEmp.add(new Employee("Sachin", 5));
		ObjEmp.add(new Employee("Sakpal", 9));
		ObjEmp.add(new Employee("Rahul", 4));
		ObjEmp.add(new Employee("Saurabh", 2));
		ObjEmp.add(new Employee("Tejas", 10));

		Collections.sort(ObjEmp);
		System.out.println(ObjEmp.toString());

//        e.execute(1, 2, (a, b) -> a + b);
//        e.execute(1, 2, (a, b) -> a / b);

	}
}
