package problem6;

import java.util.Scanner;

public class TestPalindrome {
	public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			palindrome(s);
			scanner.close();
	}
	public static void palindrome(String s) {
		int len = s.length();
		int temp = 0;
		for (int i = 0;i < len; i++) {
			if (s.charAt(i) ==  s.charAt(len - 1 - i)) temp++;
		}
		if (len == temp) System.out.println("it is palindrom");
		else System.out.println("it is not palindrome");
	}

}
