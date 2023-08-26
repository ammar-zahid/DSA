package Loops;

import java.util.*;

public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
