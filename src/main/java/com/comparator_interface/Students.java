package com.comparator_interface;

import java.util.Collections;
import java.util.LinkedList;

public class Students {
	String name;
	Integer id;

	public Students(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		LinkedList<Students> linkedList = new LinkedList<>();
		linkedList.add(new Students("sachin", 1));
		linkedList.add(new Students("vishwas", 5));
		linkedList.add(new Students("sakpal", 7));
		linkedList.add(new Students("pratibha", 3));
		linkedList.add(new Students("aparna", 2));
		linkedList.add(new Students("vaibhav", 9));

//        Collections.sort(linkedList, (o1, o2) -> {
//            return o1.id.compareTo(o2.id);
//        });

//        Collections.sort(linkedList, Comparator.comparing(o -> o.id));

		Collections.sort(linkedList, new SortByName());
		System.out.println(linkedList);

		Collections.sort(linkedList, new SortById());
		System.out.println(linkedList);
	}

	@Override
	public String toString() {
		return "name ::" + this.name + " id ::" + this.id;
	}
}

