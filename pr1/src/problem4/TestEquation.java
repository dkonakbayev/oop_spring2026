package problem4;

import java.util.Scanner;

public class TestEquation {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		quadraticequation(a , b , c) ;
		
	}
	public static void quadraticequation (double a , double b , double c ) {
		double d = (b*b) - (4*a*c) ;
		double x1 = (-b + Math.sqrt(d))/(2*a);
		double x2 = (-b - Math.sqrt(d))/(2*a);
		if (d < 0) System.out.println("discriminant is "+d+"\n"+"Error , D is lower then 0");
		else if (d == 0) System.out.println(-(b/2*a));
		else System.out.printf("discriminant is "+d+"\n"+"x_1 =" +x1 + "\n" +"x_2 =" +x2 );
			
		
	}

}
