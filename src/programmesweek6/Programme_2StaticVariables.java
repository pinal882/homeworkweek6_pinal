package programmesweek6;

public class Programme_2StaticVariables {
    /**
     * static variable-class
     * scope-within class
     * memory allocation-when class is loaded
     * store-non heap memory
     */
    static int a = 10;//static variable
    static String name = "abc";//static variable

    public static void main(String[] args) {//static method
        System.out.println(a);
        System.out.println(name);
    }
    public void myMethod(){
        //static method
        System.out.println(a);
        System.out.println(name);
    }

}
