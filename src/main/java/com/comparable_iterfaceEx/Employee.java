package com.comparable_iterfaceEx;

interface Iaddition {
	int fooadd(int a, int b);

	int fooadd(int a);
}

public class Employee implements Comparable<Employee> {
	String Name;
	Integer Id;

	Employee() {
		Name = "";
		Id = 0;
	}

	Employee(String Name, int Id) {
		this.Name = Name;
		this.Id = Id;
	}

	@Override
	public int compareTo(Employee o) {
//        if(this.Id>o.Id)
//            return 1;
//        else if (this.Id == o.Id)
//            return 0;
//        return -1;
		return this.Id.compareTo(o.Id);
	}

	//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static void execute(int a, int b, Iaddition addition) {
//        addition.fooadd(a, b);
//    }
//
	@Override
	public String toString() {
		return "Employee ID :: " + this.Id + " Employee Name :: " + this.Name + "\n";
	}
//
//    @Override
//    public int compareTo(Employee o) {
//        if (this.Id > (int) o.Id)
//            return 1;
//        else if (this.Id == (int) o.Id)
//            return 0;
//        return -1;
//    }
//
//    @Override
//    public int hashCode() {
//        return (int) this.Id * this.Name.hashCode();
//    }
}
