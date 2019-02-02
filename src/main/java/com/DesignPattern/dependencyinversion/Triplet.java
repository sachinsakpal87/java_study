package com.designpattern.dependencyinversion;

public class Triplet<P, Q, R> {
	P firstPerson;
	Q relation;
	R secondPerson;

	public Triplet(P firstPerson, Q relation, R secondPerson) {
		this.firstPerson = firstPerson;
		this.relation = relation;
		this.secondPerson = secondPerson;
	}
}
