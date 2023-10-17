package programmesweek6;

public class Programme_3Variables {

    static int a = 10;//static variable
    String name = "abc";//instance variable

    public static void main(String[] args) {
        //static and instance method
        Programme_3Variables v3  = new Programme_3Variables();
        v3.myMethod();

    }
    public void myMethod() {
        //Instance method with static and instance variable
        Programme_3Variables v1 = new Programme_3Variables();
        System.out.println(a);
        System.out.println(v1.name);
    }
    public void m1() {
        //static method with static and instance variable
        Programme_3Variables v2  = new Programme_3Variables();
        System.out.println(a);
        System.out.println(v2.name);

    }


    }









