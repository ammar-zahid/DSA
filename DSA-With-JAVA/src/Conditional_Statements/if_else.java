package Conditional_Statements;

import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age ? ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for license");
        } else {
            System.out.println("You are not eligible for license");
        }

        sc.close();
    }
}
