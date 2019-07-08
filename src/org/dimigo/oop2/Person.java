package org.dimigo.oop2;

public class Person {
    private final static String TYPE = "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String toString() {
        return "Person{" + "type='" +  + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20030101","조승원");
        Person p2 = new Person("20020404","철구");
        System.out.println(Person.TYPE);
        //p1.type = "파충류";

    }
}
