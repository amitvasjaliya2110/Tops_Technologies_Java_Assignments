package core.java.dataTypeAndOperator;

public class TypeCastingDemo {
    public static void main ( String[] args ) {
        System.out.println("Implicit Type Casting (Widening)");
        int x = 10;
        double y = x;
        System.out.println ("Implicit Casting (int to double): "+y);


        System.out.println("Explicit Type Casting (Narrowing)");
        double p = 25.75;
        int q = (int) p;
        System.out.println ("Explicit Casting (double to int): "+q);
    }
}
