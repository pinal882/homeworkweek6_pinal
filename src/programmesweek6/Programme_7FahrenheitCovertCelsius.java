package programmesweek6;

import java.util.Scanner;

public class Programme_7FahrenheitCovertCelsius {


    public static void main(String[] args) {
        //to Auto-generate Method
        float f;
        double cel=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        f  = scanner.nextFloat();
        cel = (f-32)*5/9;
        System.out.print("\nFahrenheit is :"+f);
        System.out.println("\ncelcius is : "+ cel);
        scanner.close();

        }

        }



