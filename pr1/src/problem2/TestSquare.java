package problem2;

import java.util.Scanner;

public class TestSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();	
		diagonal(a);
		area(a);
		perimeter(a);
		
	}
	
	public static void diagonal(double a ) {
		System.out.println(Math.sqrt(2)*a);
	}
	public static void area(double a ) {
		System.out.println(a*a);
	}
	public static void perimeter(double a) {
		System.out.println(a*4);
	}
}
