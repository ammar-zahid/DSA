package Functions;

import java.util.*;

public class Factorial_Function {
    public static int factorial(int x) {
        int fact = 1;

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                fact = fact * i;
            }
        } else {
            System.out.println("Enter a positive number");
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numbers: ");
        int num = sc.nextInt();

        int ans = factorial(num);
        System.out.println(ans);

        sc.close();
    }
}
