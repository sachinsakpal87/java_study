package com.designpattern.prototypepattern.demo2;

class Address{
	String address, city, country;

	public Address(String address, String city, String country) {
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public Address(Address other){
		this(other.address,other.city,other.country);
	}

	public String toString() {
		return "Address{" +
				"address='" + address + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}

class Employee{
	String name;
	Address address;

	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public Employee(Employee other){
		this.name = other.name;
		this.address = new Address(other.address);
	}

	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}

public class DemoCopyConstructor {
	public static void main(String[] args) {
		Employee sachin = new Employee("Sachin",
				new Address("Kate puram","Pune","India"));
		Employee tauseef = new Employee(sachin);
		tauseef.name = "tauseef";
		tauseef.address.address = "Kondawa";

		System.out.println(sachin);
		System.out.println(tauseef);
	}
}
