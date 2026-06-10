package de.tum.ise.entities;

public abstract class Person {
    private String matrNr;
    private String name;
    private int age;
    private int semester;
    private String email;

    public Person(String matrNr, String name, int age, int semester, String email) {
        this.matrNr = matrNr;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.email = email;
    }

    public String getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(String matrNr) {
        this.matrNr = matrNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "matrNr='" + matrNr + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", semester=" + semester +
                ", email='" + email + '\'' +
                '}';
    }
}
