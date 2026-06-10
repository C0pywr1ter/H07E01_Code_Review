package de.tum.ise.entities;

public abstract class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;

        this.email = email;
    }
}
