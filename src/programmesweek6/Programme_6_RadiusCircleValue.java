package programmesweek6;

import java.util.Scanner;

public class Programme_6_RadiusCircleValue {
//Area A =PI*r*r
    public static void main(String[] args) {
        double radius,area;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the radius of the circle:");
       radius = scanner.nextDouble();
        scanner.close();

       area  = Math.PI * radius * radius;

        System.out.println("Area of the Circle is:" + Math.PI*radius*radius);


    }
}
