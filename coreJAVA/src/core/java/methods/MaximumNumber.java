package core.java.methods;

import java.util.Scanner;

public class MaximumNumber {

    static int findMax(int a, int b,int c){
        if(a>b && a>c){
            return a;
        }else if (b>c){
            return b;
        }else {
            return c;
        }
    }
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int z = sc.nextInt();

        int max = findMax(x,y,z);
        System.out.println("Maximum Number is: "+max);
    }
}
