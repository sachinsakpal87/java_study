package com.equals_hashcode_ex;

import java.util.HashMap;
import java.util.HashSet;

class Employee{
	String name;
	Integer empId;

	public Employee(String name, Integer empId) {
		this.name = name;
		this.empId = empId;
	}

	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", empId=" + empId +
				'}';
	}

	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return  this.name.equals(other.name)&&this.empId.equals(other.empId);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode()*this.empId;
	}
}
public class DemoEqualsHashcode {
	public static void main(String[] args) {
		HashMap<Employee,String> map = new HashMap<>();
		HashSet<Employee> set = new HashSet<>();
		Employee e1 = new Employee("Sachin",1);
		Employee e2 = new Employee("Aparna",2);
		Employee e3 = new Employee("Vishwas",3);
		Employee e4 = new Employee("Sachin",1);
		Employee e5 = new Employee("Sachin",1);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);

//		map.put(e1,e1.name);
//		map.put(e2,e2.name);
//		map.put(e3,e3.name);
//		map.put(e4,e4.name);
//		map.put(e5,e5.name);

		System.out.println(map);

//		System.out.println(set);

	}
}
