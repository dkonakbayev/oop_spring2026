package problem1;

import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        dash(name);
        System.out.println("|" + name + "|");
        dash(name);
    }

    public static void dash(String name){
        System.out.printf("+");
        for (int i = 0; i < name.length(); i++){
            System.out.printf("-");
        }
        System.out.println("+");
    }
    
}