package com.design_pattern.dependencyinversion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Relation {
	PARENT,
	CHILD;
}

interface IRelationship {
	List<Triplet<Person, Relation, Person>> getChildren(String name);
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}

class Relationships implements IRelationship {
	List<Triplet<Person, Relation, Person>> relationship = new ArrayList<>();

	@Override
	public List<Triplet<Person, Relation, Person>> getChildren(String name) {
		return relationship.stream()
				.filter(x -> x.firstPerson.name.equals(name) && x.relation.equals(Relation.PARENT))
				.collect(Collectors.toList());
	}

	public List<Triplet<Person, Relation, Person>> getRelationship() {
		return relationship;
	}

	void addParentChildRelationship(Person person1, Person person2) {
		relationship.add(new Triplet<>(person1, Relation.PARENT, person2));
		relationship.add(new Triplet<>(person2, Relation.CHILD, person1));
	}
}

class Research {

//    Research(Relationships relationships){
//
//        final List<Triplet<Person, Relation, Person>> relationship = relationships.getRelationship();
//        relationship.stream()
//                .filter(x->x.firstPerson.name.equals("John")&&x.relation.equals(Relation.PARENT))
//                .forEach(c-> System.out.println("John has children name : "+c.secondPerson.name));
//    }

	Research(IRelationship relationships) {

		relationships
				.getChildren("John")
				.forEach(c -> System.out.println("John has children name : " + c.secondPerson.name));
		;
	}
}

public class DemoDependencyInversion {
	public static void main(String[] args) {
		Relationships relationships = new Relationships();
		final Person Parent = new Person("John");
		final Person child1 = new Person("Matt");
		final Person child2 = new Person("Andy");

		relationships.addParentChildRelationship(Parent, child1);
		relationships.addParentChildRelationship(Parent, child2);

		Research research = new Research(relationships);
	}
}
