package Functions;

import java.util.*;

public class Sum_Function {
    public static int TwoNumbersSum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = TwoNumbersSum(x, y);
        System.out.println(ans);

        sc.close();
    }
}
