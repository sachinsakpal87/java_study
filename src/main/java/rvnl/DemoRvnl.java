package rvnl;

class Person {
    String name;
    String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

public class DemoRvnl {

    public static void main(String[] args) {
        int i = 5;
        final int j = 6;
        Person person = new Person("Sachin", "21/05/1987");
        final Person person1 = new Person("Chandresh", "02/03/1987");

        // a final reference variable sb
        final StringBuilder sb = new StringBuilder("Geeks");

        System.out.println(sb);

        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForGeeks");

        System.out.println(sb);


        i = 9;
//        j = 9;

        System.out.println(person.name);
        System.out.println(person1);

        person.setName("Swati");
        person1.setName("Nikhil");

        System.out.println(person);
        System.out.println(person1);


    }
}
