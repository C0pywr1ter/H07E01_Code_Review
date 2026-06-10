package de.tum.ise.entities;

public abstract class Person {
     String name;
     int age;
     String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;

        this.email = email;
    }
}
