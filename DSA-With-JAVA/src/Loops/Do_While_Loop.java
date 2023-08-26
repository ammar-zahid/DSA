package Loops;

import java.util.*;

public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to print the table of: ");
        int num = sc.nextInt();

        int i = 0;
        do {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;

        } while (i <= 10);

        sc.close();
    }
}
