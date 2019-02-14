package com.lambda_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Person{
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				'}';
	}
}

class SortPersonByName implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
public class DemoLambdaEx4 {
	private static List<Person> personList = new ArrayList<>();
	public static void main(String[] args) {

		personList.add(new Person("Sachin","Sakpal",30));
		personList.add(new Person("Aparna","Sakpal",35));
		personList.add(new Person("Vishwas","Sakpal",63));
		personList.add(new Person("Pratibha","Sakpal",58));

		personList.sort(new SortPersonByName());
		System.out.println(personList);
		printElementStart(person->person.getFirstName().startsWith("A"));
	}

	private static void printElementStart(Predicate<Person> filter){
		for (Person person : personList){
			if(filter.test(person)){
				System.out.println(person);
			}
		}
	}
}
