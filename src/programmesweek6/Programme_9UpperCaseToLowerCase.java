package programmesweek6;

import java.util.Scanner;


public class Programme_9UpperCaseToLowerCase {
    //input a to z ----> Uppercase
    //input A TO Z -----> Lower convert

    public static void main(String[] args) {
        char ch, ch2;
        System.out.println("Enter any character");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') ;
        {
            ch2 = Character.toLowerCase (ch) ;
            System.out.println("Lowercase" + ch2);
        }
scanner.close();

        }
    }




