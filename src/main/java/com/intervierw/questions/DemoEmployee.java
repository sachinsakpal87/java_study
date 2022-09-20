package com.intervierw.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    Integer employeeId;

    Employee(String name,int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee o1) {
        return this.employeeId.compareTo(o1.employeeId);
    }

    @Override
    public String toString(){
        return this.employeeId+" "+this.name;
    }

    @Override
    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        return this.employeeId == e.employeeId && this.name == e.name;
    }

    @Override
    public int hashCode(){
      return this.employeeId * this.name.hashCode();
    }
}

class SortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return o1.name.compareTo(o2.name);
    }
}

class SortById implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return o1.employeeId.compareTo(o2.employeeId);
    }
}

public class DemoEmployee {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Rahul",9));
        emp.add(new Employee("Sehwagh",2));
        emp.add(new Employee("Virat",7));
        emp.add(new Employee("Hardik",1));
        emp.add(new Employee("Sachin",10));

        //Comparable compareTo implementation required for this
        Collections.sort(emp);
        // ToString implementation required for this
        System.out.println("Sort By Id Natural sorting : "+emp);

        // Comparator sort by name
        Collections.sort(emp, new SortByName());
        // ToString implementation required for this
        System.out.println("Sort By Name : "+emp);

        // Comparator sort by Id
        Collections.sort(emp, new SortById());
        // ToString implementation required for this
        System.out.println("Sort By Id : "+emp);

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Sachin", 1));
        hashSet.add(new Employee("Sachin", 1));
        System.out.println(hashSet);
    }
}
