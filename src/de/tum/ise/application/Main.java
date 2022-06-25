package de.tum.ise.application;

import de.tum.ise.entities.Student;
import de.tum.ise.repository.ExamRepository;
import de.tum.ise.repository.StudentRepository;
import de.tum.ise.service.ExamManagementService;

public class Main {
    public static void main(String[] args) {
        // Test program here

        Student bob = new Student("Bob", 22,"bob@mail.com", "bo5454",5);
        Student alice = new Student("Alice", 21,"alice@mail.com", "al5454",3);

        ExamManagementService service = new ExamManagementService(new ExamRepository(), new StudentRepository());

        service.registerStudent(bob);
        service.registerStudent(alice);

        service.removeStudentByMatrNr(bob.getMatrNr());

    }
}
