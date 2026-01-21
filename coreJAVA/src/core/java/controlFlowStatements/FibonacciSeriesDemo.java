package core.java.controlFlowStatements;

import java.util.Scanner;

public class FibonacciSeriesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of fibonacci series: ");
        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " , ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
}
