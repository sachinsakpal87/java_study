package com.DesignPattern.builderpatter.fluentBuilder;

class Person {
	String name;
	String position;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}

class PersonBuilder<T extends PersonBuilder<T>> {

	protected Person p;

	PersonBuilder() {
		p = new Person();
	}

	T setName(String name) {
		p.name = name;
		return self();
	}

	Person build() {
		return p;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	T self() {
		return (T) this;
	}
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

	EmployeeBuilder worksAs(String position) {
		p.position = position;
		return this;
	}

	@Override
	EmployeeBuilder self() {
		return super.self();
	}
}

public class DemoFluentBuilder {
	public static void main(String[] args) {
		final EmployeeBuilder personBuilder = new EmployeeBuilder();
		final Person sachin = personBuilder
				.setName("sachin")
				.worksAs("Developer")
				.build();
		System.out.println(sachin);
	}
}