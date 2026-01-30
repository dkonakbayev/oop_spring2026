package problem3;

import java.util.Scanner;

public class TestGrades {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double grade = scanner.nextDouble();
		grades(grade);
	}
	public static void grades(double a) {
		if (a <= 100 && a >=94.5) System.out.println("A");
		else if (a >= 89.5) System.out.println("A-");
		else if (a >= 84.5 ) System.out.println("B+");
		else if (a >= 79.5 ) System.out.println("B");
		else if (a >= 74.5 ) System.out.println("B-");
		else if (a >= 69.5 ) System.out.println("C+");
		else if (a >= 64.5 ) System.out.println("C");
		else if (a >= 59.5 ) System.out.println("C-");
		else if (a >= 54.5 ) System.out.println("D+");
		else if (a >= 49.5 ) System.out.println("D");
		else System.out.println("F");
		
	}
}
