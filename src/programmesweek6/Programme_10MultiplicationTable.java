package programmesweek6;

import java.util.Scanner;

public class Programme_10MultiplicationTable {


    public static void main(String[] args) {
        //multiplication table
        int number,multiplier;
        Scanner scanner=  new Scanner(System.in);
        System.out.println("Input a number:");
        number = scanner.nextInt();

        for (multiplier =1; multiplier<=10;multiplier++){
        System.out.printf ("%d * %d = %d\n", number ,multiplier,(number * multiplier));
            scanner.close();
        }


    }
}
