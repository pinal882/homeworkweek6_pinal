package programmesweek6;

import java.util.Scanner;

public class Programme_16AddTwoBinaryNumbers {

    int a;
    int b;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String a = scanner.next();
        System.out.println("Enter second binary number");
        String b = scanner.next();

        int var = Integer.parseInt(a, 2);
        int var1 = Integer.parseInt(b, 2);
        int var2 = var + var1;
//concatination
        System.out.println("sum of two binary no " + Integer.toBinaryString(var2));

        scanner.close();
    }

}









