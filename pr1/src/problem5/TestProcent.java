package problem5;

import java.util.Scanner;

public class TestProcent {
	public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			double sum = scanner.nextDouble();
			double p = scanner.nextDouble();
			percentage(sum,p);
			
	}
	public static void percentage(double sum , double p){
		double jj = (p/100) * (sum);
		double new_balance = jj + sum ;
		System.out.println("new balance =" + new_balance);
	}
}
