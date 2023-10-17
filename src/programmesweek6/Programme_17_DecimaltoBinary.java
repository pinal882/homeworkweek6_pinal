package programmesweek6;

import java.util.Scanner;

public class Programme_17_DecimaltoBinary {
int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal No");
        int a = scanner.nextInt();
        System.out.println("Binary equivalent of "+a+"is:");
        System.out.println((Integer.toBinaryString(a)));


        scanner.close();

    }
}
