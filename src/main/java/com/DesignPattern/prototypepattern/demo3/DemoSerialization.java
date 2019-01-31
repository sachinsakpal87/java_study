package com.DesignPattern.prototypepattern.demo3;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

class Emplyee implements Serializable {
	String name;
	Integer id;

	public Emplyee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "Emplyee{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}
}

public class DemoSerialization {
	public static void main(String[] args) {
		Emplyee sachin = new Emplyee("Sachin", 21);
		Emplyee mandar = SerializationUtils.roundtrip(sachin);

		mandar.name = "Mandar";
		mandar.id = 25;

		System.out.println(sachin);
		System.out.println(mandar);

	}
}
