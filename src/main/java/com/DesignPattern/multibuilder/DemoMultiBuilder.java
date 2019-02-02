package com.designpattern.multibuilder;

class Person{
	String first, last;
	String address,city,state,postCode;

	String company,position,salary;

	public String toString() {
		return "Person{" +
				"first='" + first + '\'' +
				", last='" + last + '\'' +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", postCode='" + postCode + '\'' +
				", company='" + company + '\'' +
				", position='" + position + '\'' +
				", salary='" + salary + '\'' +
				'}';
	}
}

class PersonBuilder{
	protected Person person = new Person();

	PersonBuilder setName(String first, String last){
		person.first = first;
		person.last = last;
		return this;
	}

	AddressBuilder lives(){
		return new AddressBuilder(person);
	}

	EmployeeBuilder works(){
		return new EmployeeBuilder(person);
	}

	Person Build(){
		return person;
	}
}

class AddressBuilder extends PersonBuilder {

	AddressBuilder(Person person){
		this.person = person;
	}
	AddressBuilder at(String address){
		person.address = address;
		return this;
	}
	AddressBuilder city(String city){
		person.city = city;
		return this;
	}

	AddressBuilder state(String state){
		person.state = state;
		return this;
	}

	AddressBuilder postalCode(String postCode){
		person.postCode = postCode;
		return this;
	}
}

class EmployeeBuilder extends PersonBuilder {

	EmployeeBuilder(Person person){
		this.person = person;
	}
	EmployeeBuilder atCompany(String company){
		person.company = company;
		return this;
	}
	EmployeeBuilder asA(String position){
		person.position = position;
		return this;
	}

	EmployeeBuilder annualIncome(String salary){
		person.salary = salary;
		return this;
	}
}

public class DemoMultiBuilder {
	public static void main(String[] args) {
		PersonBuilder pb = new PersonBuilder();
		Person person = pb
				.setName("Sachin","Sakpal")
				.lives()
				.at("Kate Puram")
				.city("Pune")
				.state("Maharashtra")
				.postalCode("411016")
				.works()
				.atCompany("Appdirect")
				.asA("SAE")
				.annualIncome("12000")
				.Build();

		System.out.println(person);
	}
}
