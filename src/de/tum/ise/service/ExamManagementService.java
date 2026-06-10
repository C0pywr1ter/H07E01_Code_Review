package de.tum.ise.service;

import de.tum.ise.entities.Exam;
import de.tum.ise.entities.Student;
import de.tum.ise.repository.ExamRepository;
import de.tum.ise.repository.StudentRepository;

import java.util.NoSuchElementException;

public class ExamManagementService {

    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;

    public ExamManagementService(ExamRepository examRepository, StudentRepository studentRepository) {
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
    }

    public Student getStudentByMatrNr(String matrNr) {

        // TODO 2.1 : throw NoSuchElementException in case the student was not found
        if(studentRepository.getStudentByMatrNr(matrNr) == null) {
            throw new NoSuchElementException("Student not found");
        }

        return studentRepository.getStudentByMatrNr(matrNr);
    }

    public void registerStudent(Student student) {
        if (studentIsNotNull(student)) {
            studentRepository.addStudent(student);
            System.out.println("Student has been registered successfully.");
        }
    }

    public void removeStudentByMatrNr(String matrNr) {
        studentRepository.removeStudentByMatrNr(matrNr);
        System.out.println("Student has been removed successfully");
    }


    public Exam getExamById(Long id) {
        return examRepository.getExamById(id);
    }

    public void registerExam(Exam exam) {
       examRepository.registerExam(exam);
    }

    public void removeExamById(Long id) {
       examRepository.removeExamById(id);
    }

    // Helper function
    boolean studentIsNotNull(Student student) {
        return student != null;
    }
}
