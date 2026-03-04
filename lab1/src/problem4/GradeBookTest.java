package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Course course = new Course(
                "OOP in Java",
                "Introduction to Object Oriented Programming",
                5,
                "None"
        );

        List<Student> students = new ArrayList<>();

        students.add(new Student("Daulet", 1));
        students.add(new Student("Rassul", 2));
        students.add(new Student("Miras", 3));

        GradeBook gradeBook = new GradeBook(course, students);

        gradeBook.displayMessage();

        for (Student s : students) {
            System.out.print("Enter grade for " + s.getName() + ": ");
            int grade = scanner.nextInt();
            gradeBook.addGrade(s, grade);
        }

        gradeBook.displayGradeReport();

        scanner.close();
    }
}