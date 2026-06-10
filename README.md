# Code Review Practice: Exam Management System

This project is a small Java-based application designed for practicing code review and refactoring. It implements a basic Exam Management System with entities like Students, Professors, and Exams, managed through a service layer.

## Purpose

The primary goal of this repository was to practice identifying and fixing common "code smells" and design issues. The transition from poorly written code to a more refined version can be tracked through the project's commit history.

## Key Improvements Made

Based on the commit history, several refactoring steps were taken:

- **Inheritance and Encapsulation:** Fixed issues where the base `Person` class contained fields that were only relevant to specific subclasses (e.g., matriculation number and semester belonged to `Student`, not `Professor`).
- **Error Handling:** Implemented proper exception handling (e.g., throwing `NoSuchElementException` when a student or exam is not found) instead of returning `null` or leaving `TODO` comments.
- **Service Layer Implementation:** Completed missing functionality in the `ExamManagementService` for registering and removing exams.
- **Code Cleanliness:** Improved variable naming, removed redundant comments, and ensured better separation of concerns between entities, repositories, and services.

## Project Structure

- `de.tum.ise.entities`: Contains the domain models (`Person`, `Student`, `Professor`, `Exam`).
- `de.tum.ise.repository`: In-memory storage logic for students and exams.
- `de.tum.ise.service`: Business logic for managing student registration and exam assignments.
- `de.tum.ise.application`: Entry point of the application for testing purposes.

## How to Use

1. **Explore the History:** Check the `git log` to see the step-by-step improvements from the initial "poorly written" state to the current version.
2. **Build and Run:** This is a Gradle-based project. You can build it using:
   ```bash
   ./gradlew build
   ```
   And run the test program in `Main.java` via:
   ```bash
   ./gradlew run
   ```

## Learning Outcomes

- Identifying misplaced responsibilities in class hierarchies.
- Moving from `null` checks to robust exception handling.
- Basic principles of Clean Code and DRY (Don't Repeat Yourself).
