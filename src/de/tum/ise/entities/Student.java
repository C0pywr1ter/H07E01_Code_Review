package de.tum.ise.entities;

public class Student extends Person{


    private String matrNr;
    private int semester;



    // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
  	// TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Student(String name, int age, String email, String matrNr, int semester) {
        super(name, age, email);
        this.semester = semester;
       this.matrNr = matrNr;
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

    public void increaseSemester() {
        this.semester ++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr='" + matrNr + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", semester=" + semester +
                ", email='" + email + '\'' +
                '}';
    }
}
