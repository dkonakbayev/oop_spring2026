package problem1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DataTest data = new DataTest();
	
	
	while (true) {
		System.out.println("Enter number (Q to quit):");
		String input = scanner.nextLine();
		
		if (input.equalsIgnoreCase("Q")) {
            break;
        }
		
		Double value = Double.parseDouble(input);
		data.add(value);
	}
	
	System.out.println("Average = " + data.getavg());
	System.out.println("Maximum = " + data.getmax());
	
	
	scanner.close();
}
}


	
