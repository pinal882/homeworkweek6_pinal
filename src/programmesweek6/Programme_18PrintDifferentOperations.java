package programmesweek6;

import java.util.Scanner;

public class Programme_18PrintDifferentOperations {

    int num1= 125;
    int num2 = 24;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number2");
        int num2 = scanner.nextInt();
        System.out.println("125 + 24 = 149");
        System.out.println("125 - 24 = 101");
        System.out.println("125 * 24 = 3000");
        System.out.println("125/24 = 5");
        Object mod = 5;
        System.out.println(125 + " mod " + 24 + " = " + (num1%num2));

        scanner.close();






    }
}
