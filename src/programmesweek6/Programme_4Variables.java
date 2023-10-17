package programmesweek6;

public class Programme_4Variables {

    static int a = 10, b = 20;//static variable
    String name = "abc,xyz";//instance variable

    public static void main(String[] args) {
        Programme_4Variables v1 = new Programme_4Variables();//static method

    }

    public void myMethod() {
        // Instance Method
        Programme_4Variables v1 = new Programme_4Variables();//object creation
        System.out.println("a,b");//static variable
        System.out.println(v1.name);//instance variable

    }
    public static void m1(){
        Programme_4Variables v1 = new Programme_4Variables();
        System.out.println("a,b");//static variable
        System.out.println("v1.name");//instance variable

    }

}
