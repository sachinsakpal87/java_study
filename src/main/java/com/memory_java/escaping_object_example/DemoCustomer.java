package com.memory_java.escaping_object_example;

public class DemoCustomer {
	public static void main(String[] args) {

		Integer integer = 10;
		Integer integer1 = 10;
		Integer integer2 = new Integer(10);

		System.out.println(integer);
		System.out.println(integer1);
		System.out.println(integer2);

		System.out.println(integer==integer1);
		System.out.println(integer==integer2);

		CustList list = new CustList();
		list.setCustomerList("sachin");
		list.setCustomerList("vishwas");
		list.setCustomerList("sakpal");

		System.out.println(list.getCustomerNameById(2).getName());
	}
}
