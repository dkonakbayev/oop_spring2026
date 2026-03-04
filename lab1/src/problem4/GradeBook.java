package problem4;

import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades; 

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new HashMap<>();
    }


    public void displayMessage() {
        System.out.println("Welcome to the GradeBook for " + course);
    }

    public void addGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int g : grades.values()) {
        	sum += g;
        }
        return sum / grades.size();
    } 

    public void findBestAndWorst() {
        if (grades.isEmpty()) return;

        Student best = null;
        Student worst = null;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int g = entry.getValue();
            if (g > max) {
                max = g;
                best = entry.getKey();
            }
            if (g < min) {
                min = g;
                worst = entry.getKey();
            }
        }

        System.out.println("Best grade: " + max + " (Student: " + best.getName() + ")");
        System.out.println("Worst grade: " + min + " (Student: " + worst.getName() + ")");
    }

    public void outputBarChart() {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("A", 0);
        freq.put("B", 0);
        freq.put("C", 0);
        freq.put("D", 0);
        freq.put("F", 0);

        for (int g : grades.values()) {
            String letter = "";
            if (g >= 90) letter = "A";
            else if (g >= 80) letter = "B";
            else if (g >= 70) letter = "C";
            else if (g >= 60) letter = "D";
            else letter = "F";

            freq.put(letter, freq.get(letter) + 1);
        }

        System.out.println("\nGrade distribution:");
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.print(e.getKey() + ": ");
            for (int i = 0; i < e.getValue(); i++) System.out.print("*");
            System.out.println();
        }
    }

    public void displayGradeReport() {
        System.out.println("\n--- Grade Report ---");
        System.out.println("Class average: " + determineClassAverage());
        findBestAndWorst();
        outputBarChart();
    }
}
