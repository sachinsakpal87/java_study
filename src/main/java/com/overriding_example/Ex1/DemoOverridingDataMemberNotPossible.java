package com.overriding_example.Ex1;

class DMParent {
	public int variable = 50;
}

class DMChild extends DMParent {
	public int variable = 100;
}

public class DemoOverridingDataMemberNotPossible {
	public static void main(String[] args) {
		DMParent obj = new DMChild();
		System.out.println("overriding of data member not possible " + ((DMChild) obj).variable);
	}
}
