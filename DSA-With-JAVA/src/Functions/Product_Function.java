package Functions;

import java.util.*;

public class Product_Function {
    public static int productFunction(int x, int y) {
        int sum = x * y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = productFunction(x, y);
        System.out.println(ans);

        sc.close();
    }
}
