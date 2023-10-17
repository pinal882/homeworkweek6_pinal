package programmesweek6;

public class Programme_1InstanceVariables {
/**
 * Scope-within the class
 * Memory allocation-when object is created
 * memory - heap
 */
int a =10;// a is a Instance or Global variable
    String name = "abc";//name is instance or global variable

    public static void main(String[] args) {
        //instance method
        Programme_1InstanceVariables v1 = new Programme_1InstanceVariables();
        System.out.println(v1.a);
        System.out.println(v1.name);
    }
    public void myMethod() {
        //instance method
        Programme_1InstanceVariables v1 = new Programme_1InstanceVariables();
        System.out.println(v1.a);
        System.out.println(v1.name);

    }


}
