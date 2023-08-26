package Variables_Datatypes_IO;

import java.util.*;

public class Inputs_and_Outputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("What is your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        sc.close();
    }
}
