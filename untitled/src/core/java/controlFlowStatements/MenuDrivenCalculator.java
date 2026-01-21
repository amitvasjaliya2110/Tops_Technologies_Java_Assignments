package core.java.controlFlowStatements;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt ();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt ();

        System.out.println("\n--------Calculator Menu----------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");

        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition = "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction = "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication = "+(num1*num2));
                break;
            case 4:
                System.out.println("Division = "+(num1/num2));
                break;
            case 5:
                System.out.println("Modulus = "+(num1%num2));
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 to 5.");
        }
    }
}
