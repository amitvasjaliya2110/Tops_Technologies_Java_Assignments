package core.java.methods;

public class MethodOverloadingEx {

    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }


    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main ( String[] args ) {
        System.out.println("Sum of integers: "+add (55,55));
        System.out.println("Sum of doubles: "+add (12.5,12.5));
        System.out.println("Sum of three integers: "+add (55,55,55));
    }
}
