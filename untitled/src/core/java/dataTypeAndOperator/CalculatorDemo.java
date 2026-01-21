package core.java.dataTypeAndOperator;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter a First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter a Second Number: ");
        int b = sc.nextInt();

        System.out.println("*******************--Arithmetic Operation--*********************");
        System.out.println("Addition : "+(a + b));
        System.out.println("Subtraction : "+(a - b));
        System.out.println("Multiplication : "+(a * b));
        System.out.println("Division : "+(a / b));
        System.out.println("Modulus : "+(a % b));

        System.out.println("*******************--Relational Operation--*********************");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}
