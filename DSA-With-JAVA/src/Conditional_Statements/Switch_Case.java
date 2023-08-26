package Conditional_Statements;

import java.util.*;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose to say\n1. Hello\n2. Salaam\n3. Namaste");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Salaam");
                break;
            case 3:
                System.out.println("Namaste");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();
    }
}
