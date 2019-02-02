package com.generics;

class Employee implements Comparable<Employee> {
	String name;
	Integer id;

	public Employee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id < o.id) {
			return -1;
		}
		if (this.id == o.id) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Name :: " + this.name + " Id :: " + this.id;
	}
}

class BoundTypeParameter {

	public <T extends Comparable<T>> T findMin(T first, T second) {
		if (first.compareTo(second) < 0) {
			return first;
		}
		return second;
	}

//    public Integer findMin(Integer first, Integer second){
//        if(first.compareTo(second)<0)
//            return first;
//        return second;
//    }
//
//    public string_demo findMin(string_demo first, string_demo second){
//        if(first.compareTo(second)<0)
//            return first;
//        return second;
//    }
//
//    public Double findMin(Double first, Double second){
//        if(first.compareTo(second)<0)
//            return first;
//        return second;
//    }
}

public class DemoBoundTypeParameter {
	public static void main(String[] args) {
		final BoundTypeParameter boundTypeParameter = new BoundTypeParameter();
		System.out.println("Minimum is :: " + boundTypeParameter.findMin(1, 5));
		System.out.println("Minimum is :: " + boundTypeParameter.findMin("Sachin", "Swati"));
		System.out.println("Minimum is :: " + boundTypeParameter.findMin(1.5, 1.3));
		System.out.println("Minimum is :: " + boundTypeParameter.findMin(new Employee("sachin", 21), new Employee("Tauseef", 35)));
	}
}
