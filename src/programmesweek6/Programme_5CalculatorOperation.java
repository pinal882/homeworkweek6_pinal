package programmesweek6;

import java.util.Scanner;

public class Programme_5CalculatorOperation{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First Number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        addition(a,b);
        subtraction(a,b);
        Programme_5CalculatorOperation calculatorOperation = new Programme_5CalculatorOperation();
        calculatorOperation.division (a,b);
        calculatorOperation.multiplication(a,b);
scanner.close();
    }
        //static method
        public static void addition(int a,int b) {//static method
        int add = a + b;
            System.out.println("Addition of two number is" + add);
        }
        public static void subtraction(int a, int b) {//static method
            int sub = a - b;
            System.out.println("Subtraction of two number is" + sub);
        }
        public void division(int a, int b) {//instance method
            int div = a / b;
            System.out.println("Division of two number is " + div);
        }
        public  void multiplication (int a, int b){//instance method
            int mul = a * b;
            System.out.println("Multiplication of the two number is" + mul);
        }




    }

