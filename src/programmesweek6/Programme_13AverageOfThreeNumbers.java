package programmesweek6;

import java.util.Scanner;


public class Programme_13AverageOfThreeNumbers {

    // average of three numbers
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        
        float a,b,c,avg;

        System.out.println("\n Enter three numbers:");
        
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c= scanner.nextFloat();
        
        avg = (a+b+c) / 3;
        System.out.println("\n Average = "+avg);
        scanner.close();

    }
}
