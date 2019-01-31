package com.DesignPattern.prototypepattern.demo1;

import java.util.Arrays;

class Address implements Cloneable {
	String address;
	Integer houseNumber;

	public Address(String address, Integer houseNumber) {
		this.address = address;
		this.houseNumber = houseNumber;
	}

	public String toString() {
		return "Address{" +
				"address='" + address + '\'' +
				"houseNumber="+ houseNumber+ '\'' +
				'}';
	}

	public Object clone() throws CloneNotSupportedException {
		return new Address(address,houseNumber);
	}
}

class Person implements Cloneable {
	String[] name;
	Address address;

	public Person(String[] name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return "Person{" +
				"name=" + Arrays.toString(name) +
				", address=" + address +
				'}';
	}

	public Object clone() throws CloneNotSupportedException {
		return new Person(name.clone(),(Address) address.clone());
	}
}

public class DemoClonable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person sachin = new Person(new String[] { "Sachin", "Sakpal" }, new Address("Kate Puram", 1104));

		Person aparna = (Person) sachin.clone();
		aparna.name[0] = "Aparna";
		aparna.address.address = "London";
		aparna.address.houseNumber = 1103;
		System.out.println(sachin);
		System.out.println(aparna);
	}
}
