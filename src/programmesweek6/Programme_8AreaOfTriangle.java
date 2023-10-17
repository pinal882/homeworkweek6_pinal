package programmesweek6;

import java.util.Scanner;
//import java.math;
public class Programme_8AreaOfTriangle {
    //find semiperimeter
    //find area

    public static void main(String[] args) {
        int a,b,c,sp,Double;
        System.out.println("Enter value for sides of Triangle");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

       sp = (a+b+c)/2;
       double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle" + area);
scanner.close();
    }
}
