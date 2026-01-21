package core.java.controlFlowStatements;

import java.util.Scanner;

public class OddEvenDemo {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if( num % 2 == 0){
            System.out.println ("The number is even.");
        }else {
            System.out.println ("The number is odd.");
        }
    }
}
