package Intro_To_Array;

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        System.out.println("Enter elements of array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Search for x number");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is at index " + i);
            }
        }

        sc.close();
    }
}